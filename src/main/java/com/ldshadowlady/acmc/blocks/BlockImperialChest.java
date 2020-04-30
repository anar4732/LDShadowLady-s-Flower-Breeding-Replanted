package com.ldshadowlady.acmc.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.*;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BedTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.datafix.fixes.BlockStateFlatternEntities;
import net.minecraft.util.math.*;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

import java.util.Optional;

import static net.minecraft.state.properties.BlockStateProperties.FACING;

public class BlockImperialChest extends HorizontalBlock {

    public static final EnumProperty<ChestPart> PART = BlockStateProperties.CHEST_PART;
    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;

    public BlockImperialChest(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.setDefaultState((BlockState)((BlockState)this.stateContainer.getBaseState()).with(HORIZONTAL_FACING, Direction.SOUTH));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new IProperty[]{HORIZONTAL_FACING});
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        return (BlockState)this.getDefaultState().with(HORIZONTAL_FACING, p_196258_1_.getNearestLookingDirection().getOpposite().getOpposite());
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     * @deprecated call via {@link IBlockState#getMapColor(IBlockAccess,BlockPos)} whenever possible.
     * Implementing/overriding is fine.
     */
    public MaterialColor getMaterialColor(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.get(PART) == BedPart.FOOT ? this.color.getMapColor() : MaterialColor.WOOL;
    }

    @Nullable
    @OnlyIn(Dist.CLIENT)
    public static Direction func_220174_a(IBlockReader p_220174_0_, BlockPos p_220174_1_) {
        BlockState blockstate = p_220174_0_.getBlockState(p_220174_1_);
        return blockstate.getBlock() instanceof BedBlock ? blockstate.get(HORIZONTAL_FACING) : null;
    }


    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isRemote) {
            return true;
        } else {
            if (state.get(PART) != BedPart.HEAD) {
                pos = pos.offset(state.get(HORIZONTAL_FACING));
                state = worldIn.getBlockState(pos);
                if (state.getBlock() != this) {
                    return true;
                }
            }

            net.minecraftforge.common.extensions.IForgeDimension.SleepResult sleepResult = worldIn.dimension.canSleepAt(player, pos);
            if (sleepResult != net.minecraftforge.common.extensions.IForgeDimension.SleepResult.BED_EXPLODES) {
                if (sleepResult == net.minecraftforge.common.extensions.IForgeDimension.SleepResult.DENY) return true;
                if (state.get(OCCUPIED)) {
                    player.sendStatusMessage(new TranslationTextComponent("block.minecraft.bed.occupied"), true);
                    return true;
                } else {
                    player.trySleep(pos).ifLeft((p_220173_1_) -> {
                        if (p_220173_1_ != null) {
                            player.sendStatusMessage(p_220173_1_.getMessage(), true);
                        }

                    });
                    return true;
                }
            } else {
                worldIn.removeBlock(pos, false);
                BlockPos blockpos = pos.offset(state.get(HORIZONTAL_FACING).getOpposite());
                if (worldIn.getBlockState(blockpos).getBlock() == this) {
                    worldIn.removeBlock(blockpos, false);
                }

                worldIn.createExplosion((Entity)null, DamageSource.netherBedExplosion(), (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 5.0F, true, Explosion.Mode.DESTROY);
                return true;
            }
        }
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (facing == getDirectionToOther(stateIn.get(PART), stateIn.get(HORIZONTAL_FACING))) {
            return facingState.getBlock() == this && facingState.get(PART) != stateIn.get(PART) ? stateIn.with(OCCUPIED, facingState.get(OCCUPIED)) : Blocks.AIR.getDefaultState();
        } else {
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
    }

    /**
     * Given a bed part and the direction it's facing, find the direction to move to get the other bed part
     */
    private static Direction getDirectionToOther(BedPart p_208070_0_, Direction p_208070_1_) {
        return p_208070_0_ == BedPart.FOOT ? p_208070_1_ : p_208070_1_.getOpposite();
    }

    /**
     * Spawns the block's drops in the world. By the time this is called the Block has possibly been set to air via
     * Block.removedByPlayer
     */
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, Blocks.AIR.getDefaultState(), te, stack);
    }

    /**
     * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
     * this block
     */
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        BedPart bedpart = state.get(PART);
        BlockPos blockpos = pos.offset(getDirectionToOther(bedpart, state.get(HORIZONTAL_FACING)));
        BlockState blockstate = worldIn.getBlockState(blockpos);
        if (blockstate.getBlock() == this && blockstate.get(PART) != bedpart) {
            worldIn.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 35);
            worldIn.playEvent(player, 2001, blockpos, Block.getStateId(blockstate));
            if (!worldIn.isRemote && !player.isCreative()) {
                ItemStack itemstack = player.getHeldItemMainhand();
                spawnDrops(state, worldIn, pos, (TileEntity)null, player, itemstack);
                spawnDrops(blockstate, worldIn, blockpos, (TileEntity)null, player, itemstack);
            }

            player.addStat(Stats.BLOCK_MINED.get(this));
        }

        super.onBlockHarvested(worldIn, pos, state, player);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getPlacementHorizontalFacing();
        BlockPos blockpos = context.getPos();
        BlockPos blockpos1 = blockpos.offset(direction);
        return context.getWorld().getBlockState(blockpos1).isReplaceable(context) ? this.getDefaultState().with(HORIZONTAL_FACING, direction) : null;
    }


    /**
     * @deprecated call via {@link IBlockState#hasCustomBreakingProgress()} whenever possible. Implementing/overriding is
     * fine.
     */
    @OnlyIn(Dist.CLIENT)
    public boolean hasCustomBreakingProgress(BlockState state) {
        return true;
    }

    public static Optional<Vec3d> func_220172_a(EntityType<?> p_220172_0_, IWorldReader p_220172_1_, BlockPos p_220172_2_, int p_220172_3_) {
        Direction direction = p_220172_1_.getBlockState(p_220172_2_).get(HORIZONTAL_FACING);
        int i = p_220172_2_.getX();
        int j = p_220172_2_.getY();
        int k = p_220172_2_.getZ();

        for(int l = 0; l <= 1; ++l) {
            int i1 = i - direction.getXOffset() * l - 1;
            int j1 = k - direction.getZOffset() * l - 1;
            int k1 = i1 + 2;
            int l1 = j1 + 2;

            for(int i2 = i1; i2 <= k1; ++i2) {
                for(int j2 = j1; j2 <= l1; ++j2) {
                    BlockPos blockpos = new BlockPos(i2, j, j2);
                    Optional<Vec3d> optional = func_220175_a(p_220172_0_, p_220172_1_, blockpos);
                    if (optional.isPresent()) {
                        if (p_220172_3_ <= 0) {
                            return optional;
                        }

                        --p_220172_3_;
                    }
                }
            }
        }

        return Optional.empty();
    }

    protected static Optional<Vec3d> func_220175_a(EntityType<?> p_220175_0_, IWorldReader p_220175_1_, BlockPos p_220175_2_) {
        VoxelShape voxelshape = p_220175_1_.getBlockState(p_220175_2_).getCollisionShape(p_220175_1_, p_220175_2_);
        if (voxelshape.getEnd(Direction.Axis.Y) > 0.4375D) {
            return Optional.empty();
        } else {
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos(p_220175_2_);

            while(blockpos$mutableblockpos.getY() >= 0 && p_220175_2_.getY() - blockpos$mutableblockpos.getY() <= 2 && p_220175_1_.getBlockState(blockpos$mutableblockpos).getCollisionShape(p_220175_1_, blockpos$mutableblockpos).isEmpty()) {
                blockpos$mutableblockpos.move(Direction.DOWN);
            }

            VoxelShape voxelshape1 = p_220175_1_.getBlockState(blockpos$mutableblockpos).getCollisionShape(p_220175_1_, blockpos$mutableblockpos);
            if (voxelshape1.isEmpty()) {
                return Optional.empty();
            } else {
                double d0 = (double)blockpos$mutableblockpos.getY() + voxelshape1.getEnd(Direction.Axis.Y) + 2.0E-7D;
                if ((double)p_220175_2_.getY() - d0 > 2.0D) {
                    return Optional.empty();
                } else {
                    float f = p_220175_0_.getWidth() / 2.0F;
                    Vec3d vec3d = new Vec3d((double)blockpos$mutableblockpos.getX() + 0.5D, d0, (double)blockpos$mutableblockpos.getZ() + 0.5D);
                    return p_220175_1_.areCollisionShapesEmpty(new AxisAlignedBB(vec3d.x - (double)f, vec3d.y, vec3d.z - (double)f, vec3d.x + (double)f, vec3d.y + (double)p_220175_0_.getHeight(), vec3d.z + (double)f)) ? Optional.of(vec3d) : Optional.empty();
                }
            }
        }
    }

    /**
     * @deprecated call via {@link IBlockState#getMobilityFlag()} whenever possible. Implementing/overriding is fine.
     */
    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    /**
     * Gets the render layer this block will render on. SOLID for solid blocks, CUTOUT or CUTOUT_MIPPED for on-off
     * transparency (glass, reeds), TRANSLUCENT for fully blended transparency (stained glass)
     */
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    /**
     * The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
     * LIQUID for vanilla liquids, INVISIBLE to skip all rendering
     * @deprecated call via {@link IBlockState#getRenderType()} whenever possible. Implementing/overriding is fine.
     */
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, PART, OCCUPIED);
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new BedTileEntity(this.color);
    }

    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        if (!worldIn.isRemote) {
            BlockPos blockpos = pos.offset(state.get(HORIZONTAL_FACING));
            worldIn.setBlockState(blockpos, state.with(PART, BedPart.HEAD), 3);
            worldIn.notifyNeighbors(pos, Blocks.AIR);
            state.updateNeighbors(worldIn, pos, 3);
        }

    }

    /**
     * Return a random long to be passed to {@link IBakedModel#getQuads}, used for random model rotations
     */
    @OnlyIn(Dist.CLIENT)
    public long getPositionRandom(BlockState state, BlockPos pos) {
        BlockPos blockpos = pos.offset(state.get(HORIZONTAL_FACING), state.get(PART) == BedPart.HEAD ? 0 : 1);
        return MathHelper.getCoordinateRandom(blockpos.getX(), pos.getY(), blockpos.getZ());
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

}
