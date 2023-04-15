package com.ldshadowlady.acmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.IProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class BlockCandle extends HorizontalBlock {
    public static final IntegerProperty CANDLES = IntegerProperty.create("candles", 1, 4);
	
    //xMin, yMin, zMin, xMax, yMax, zMax); //all decimals
    protected static final VoxelShape SHAPE_EAST = Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 10.0D, 7.0D, 10.0D);
    protected static final VoxelShape SHAPE_WEST  = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 9.0D, 7.0D, 9.0D);
    protected static final VoxelShape SHAPE_NORTH = Block.makeCuboidShape(7.0D, 0.0D, 6.0D, 10.0D, 7.0D, 9.0D);
    protected static final VoxelShape SHAPE_SOUTH = Block.makeCuboidShape(6.0D, 0.0D, 7.0D, 9.0D, 7.0D, 10.0D);
    protected static final VoxelShape SHAPE_MULTI = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 7.0D, 14.0D);
    
    public BlockCandle(Properties properties) {
        super(properties);
        this.setDefaultState((this.stateContainer.getBaseState()).with(HORIZONTAL_FACING, Direction.SOUTH).with(CANDLES, 1));
    }

    public int getLightValue(BlockState blockstate) {
        return super.getLightValue(blockstate) + 2 * (Integer)blockstate.get(CANDLES);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        double posX = (double)pos.getX();
        double posY = (double)pos.getY();
        double posZ = (double)pos.getZ();
        //world.addParticle(ParticleTypes.SMOKE, posX, posY, posZ, 0.0D, 0.0D, 0.0D);
        Direction blockDirection = state.get(HORIZONTAL_FACING);

        Direction FACING = state.get(HORIZONTAL_FACING);
        Integer CANDLECOUNT = state.get(CANDLES);

        if (CANDLECOUNT == 1){
            Double candleOnePosX = 0.54D;
            Double candleOnePosZ = 0.48D;
            switch (blockDirection){
                case NORTH:
                    candleOnePosX = candleOnePosX;
                    candleOnePosZ = candleOnePosZ;
                    break;
                case SOUTH:
                    candleOnePosX = candleOnePosZ;
                    candleOnePosZ = candleOnePosX;
                    break;
                case EAST:
                    candleOnePosX = candleOnePosX;
                    candleOnePosZ = 1 - candleOnePosZ;
                    break;
                case WEST:
                    candleOnePosX = 1 - candleOnePosX;
                    candleOnePosZ = candleOnePosZ;
                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + candleOnePosX, posY + 0.64D, posZ + candleOnePosZ , 0.0D, 0.0D, 0.0D);
        }
        else if (CANDLECOUNT == 2){
            Double candleOnePosX = 0.25D;
            Double candleOnePosZ = 0.58D;
            Double candleTwoPosX = 0.7D;
            Double candleTwoPosZ = 0.34D;
            Double transformedcandleOnePosX = 0.0D;
            Double transformedcandleOnePosZ = 0.0D;
            Double transformedcandleTwoPosX = 0.0D;
            Double transformedcandleTwoPosZ = 0.0D;
            switch (blockDirection) {
                case NORTH:
                    transformedcandleOnePosX = candleOnePosX;
                    transformedcandleOnePosZ = candleOnePosZ;
                    transformedcandleTwoPosX = candleTwoPosX;
                    transformedcandleTwoPosZ = candleTwoPosZ;
                    break;
                case SOUTH:
                    transformedcandleOnePosX = 1 - candleOnePosX;
                    transformedcandleOnePosZ = 1 - candleOnePosZ;
                    transformedcandleTwoPosX = 1 - candleTwoPosX;
                    transformedcandleTwoPosZ = 1 - candleTwoPosZ;
                    break;
                case WEST:
                    transformedcandleOnePosX = candleOnePosZ;
                    transformedcandleOnePosZ = 1 - candleOnePosX;
                    transformedcandleTwoPosX = candleTwoPosZ;
                    transformedcandleTwoPosZ = 1 - candleTwoPosX;
                    break;
                case EAST:
                    transformedcandleOnePosX = 1 - candleOnePosZ;
                    transformedcandleOnePosZ = candleOnePosX;
                    transformedcandleTwoPosX = 1 - candleTwoPosZ;
                    transformedcandleTwoPosZ = candleTwoPosX;
                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleOnePosX, posY + 0.58D, posZ + transformedcandleOnePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleTwoPosX , posY + 0.63D, posZ + transformedcandleTwoPosZ, 0.0D, 0.0D, 0.0D);
        }
        else if (CANDLECOUNT == 3){
            Double candleOnePosX = 0.19D;
            Double candleOnePosZ = 0.58D;
            Double candleTwoPosX = 0.56D;
            Double candleTwoPosZ = 0.67D;
            Double candleThreePosX = 0.72D;
            Double candleThreePosZ = 0.36D;
            Double transformedcandleOnePosX = 0.0D;
            Double transformedcandleOnePosZ = 0.0D;
            Double transformedcandleTwoPosX = 0.0D;
            Double transformedcandleTwoPosZ = 0.0D;
            Double transformedcandleThreePosX = 0.0D;
            Double transformedcandleThreePosZ = 0.0D;

            switch (blockDirection) {
                case NORTH:
                    transformedcandleOnePosX = candleOnePosX;
                    transformedcandleOnePosZ = candleOnePosZ;
                    transformedcandleTwoPosX = candleTwoPosX;
                    transformedcandleTwoPosZ = candleTwoPosZ;
                    transformedcandleThreePosX = candleThreePosX;
                    transformedcandleThreePosZ = candleThreePosZ;
                    break;
                case SOUTH:
                    transformedcandleOnePosX = 1 - candleOnePosX;
                    transformedcandleOnePosZ = 1 - candleOnePosZ;
                    transformedcandleTwoPosX = 1 - candleTwoPosX;
                    transformedcandleTwoPosZ = 1 - candleTwoPosZ;
                    transformedcandleThreePosX = 1 - candleThreePosX;
                    transformedcandleThreePosZ = 1 - candleThreePosZ;
                    break;
                case WEST:
                    transformedcandleOnePosX = candleOnePosZ;
                    transformedcandleOnePosZ = 1 - candleOnePosX;
                    transformedcandleTwoPosX = candleTwoPosZ;
                    transformedcandleTwoPosZ = 1 - candleTwoPosX;
                    transformedcandleThreePosX = candleThreePosZ;
                    transformedcandleThreePosZ = 1 - candleThreePosX;
                    break;
                case EAST:
                    transformedcandleOnePosX = 1 - candleOnePosZ;
                    transformedcandleOnePosZ = candleOnePosX;
                    transformedcandleTwoPosX = 1 - candleTwoPosZ;
                    transformedcandleTwoPosZ = candleTwoPosX;
                    transformedcandleThreePosX = 1 - candleThreePosZ;
                    transformedcandleThreePosZ = candleThreePosX;
                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleOnePosX , posY + 0.55D, posZ + transformedcandleOnePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleTwoPosX , posY +0.48D, posZ + transformedcandleTwoPosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleThreePosX , posY +0.63D, posZ + transformedcandleThreePosZ, 0.0D, 0.0D, 0.0D);
        }
        else {

            Double candleOnePosX = 0.19D;
            Double candleOnePosZ = 0.70D;
            Double candleTwoPosX = 0.61D;
            Double candleTwoPosZ = 0.80D;
            Double candleThreePosX = 0.34D;
            Double candleThreePosZ = 0.21D;
            Double candleFourPosX = 0.70D;
            Double candleFourPosZ = 0.41D;
            Double transformedcandleOnePosX = 0.0D;
            Double transformedcandleOnePosZ = 0.0D;
            Double transformedcandleTwoPosX = 0.0D;
            Double transformedcandleTwoPosZ = 0.0D;
            Double transformedcandleThreePosX = 0.0D;
            Double transformedcandleThreePosZ = 0.0D;
            Double transformedcandleFourPosX = 0.0D;
            Double transformedcandleFourPosZ = 0.0D;

            switch (blockDirection) {
                case NORTH:
                    transformedcandleOnePosX = candleOnePosX;
                    transformedcandleOnePosZ = candleOnePosZ;
                    transformedcandleTwoPosX = candleTwoPosX;
                    transformedcandleTwoPosZ = candleTwoPosZ;
                    transformedcandleThreePosX = candleThreePosX;
                    transformedcandleThreePosZ = candleThreePosZ;
                    transformedcandleFourPosX = candleFourPosX;
                    transformedcandleFourPosZ = candleFourPosZ;
                    break;
                case SOUTH:
                    transformedcandleOnePosX = 1 - candleOnePosX;
                    transformedcandleOnePosZ = 1 - candleOnePosZ;
                    transformedcandleTwoPosX = 1 - candleTwoPosX;
                    transformedcandleTwoPosZ = 1 - candleTwoPosZ;
                    transformedcandleThreePosX = 1 - candleThreePosX;
                    transformedcandleThreePosZ = 1 - candleThreePosZ;
                    transformedcandleFourPosX = 1 - candleFourPosX;
                    transformedcandleFourPosZ = 1 - candleFourPosZ;
                    break;
                case WEST:
                    transformedcandleOnePosX = candleOnePosZ;
                    transformedcandleOnePosZ = 1 - candleOnePosX;
                    transformedcandleTwoPosX = candleTwoPosZ;
                    transformedcandleTwoPosZ = 1 - candleTwoPosX;
                    transformedcandleThreePosX = candleThreePosZ;
                    transformedcandleThreePosZ = 1 - candleThreePosX;
                    transformedcandleFourPosX = candleFourPosZ;
                    transformedcandleFourPosZ = 1 - candleFourPosX;

                    break;
                case EAST:
                    transformedcandleOnePosX = 1 - candleOnePosZ;
                    transformedcandleOnePosZ = candleOnePosX;
                    transformedcandleTwoPosX = 1 - candleTwoPosZ;
                    transformedcandleTwoPosZ = candleTwoPosX;
                    transformedcandleThreePosX = 1 - candleThreePosZ;
                    transformedcandleThreePosZ = candleThreePosX;
                    transformedcandleFourPosX = 1 - candleFourPosZ;
                    transformedcandleFourPosZ = candleFourPosX;

                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleOnePosX , posY + 0.55D, posZ + transformedcandleOnePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleTwoPosX , posY + 0.5D, posZ + transformedcandleTwoPosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleThreePosX , posY + 0.64D, posZ + transformedcandleThreePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleFourPosX , posY + 0.58D, posZ + transformedcandleFourPosZ, 0.0D, 0.0D, 0.0D);
        }
		
/*
        if (FACING == Direction.NORTH && CANDLECOUNT == 2){
            world.addParticle(ParticleTypes.FLAME, posX + 0.25D , posY + 0.58D, posZ + 0.56D, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX +0.67D , posY + 0.63D, posZ + 0.34D, 0.0D, 0.0D, 0.0D);
        }
        else if (FACING == Direction.SOUTH && CANDLECOUNT == 2){
        }
        else if (FACING == Direction.SOUTH && CANDLECOUNT == 1){
        }
        else if (FACING == Direction.EAST && CANDLECOUNT == 1) {
        }
        else if (FACING == Direction.WEST && CANDLECOUNT == 1){
        }
        else if (FACING == Direction.NORTH && CANDLECOUNT == 3){
            world.addParticle(ParticleTypes.FLAME, posX + 0.19D , posY + 0.55D, posZ + 0.58D, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + 0.56D , posY +0.48D, posZ + 0.67D, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX +0.72D , posY +0.63D, posZ + 0.36D, 0.0D, 0.0D, 0.0D);
        }
        else if (FACING == Direction.NORTH && CANDLECOUNT == 4){
            world.addParticle(ParticleTypes.FLAME, posX + 0.19D , posY + 0.55D, posZ + 0.7D, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + 0.61D , posY + 0.5D, posZ + 0.8D, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + 0.34D , posY + 0.64D, posZ + 0.21D, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + 0.7D , posY + 0.58D, posZ + 0.41D, 0.0D, 0.0D, 0.0D);
        }
        else  {
            switch(blockDirection) {
                case EAST:
                    world.addParticle(ParticleTypes.FLAME, posX + 0.55, posY + 0.68D, posZ + 0.55D, 0.0D, 0.0D, 0.0D);
                    break;
                case WEST:
                    world.addParticle(ParticleTypes.FLAME, posX + 0.52, posY + 0.68D, posZ + 0.5D, 0.0D, 0.0D, 0.0D);
                    break;
                case NORTH:
                    world.addParticle(ParticleTypes.FLAME, posX + 0.54, posY + 0.64D, posZ + 0.48D, 0.0D, 0.0D, 0.0D);
                    break;
                case SOUTH:
                    world.addParticle(ParticleTypes.FLAME, posX + 0.5, posY + 0.68D, posZ + 0.55D, 0.0D, 0.0D, 0.0D);
                    break;
                default:
                    break;
            }
        }

*/
    }


    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new IProperty[]{HORIZONTAL_FACING,CANDLES});
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState block = context.getWorld().getBlockState(context.getPos());
        if (block.getBlock() == this)
        {
            return (BlockState)this.getDefaultState().with(CANDLES,Math.min(4, (Integer)block.get(CANDLES) + 1)).with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite().getOpposite());
        }
        else{
            return (BlockState)this.getDefaultState().with(CANDLES,1).with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite().getOpposite());
        }
    }

    @Override
    public boolean isReplaceable(BlockState p_196253_1_, BlockItemUseContext p_196253_2_) {
        return p_196253_2_.getItem().getItem() == this.asItem() && (Integer)p_196253_1_.get(CANDLES) < 4 ? true : super.isReplaceable(p_196253_1_, p_196253_2_);
    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader blockReader, BlockPos pos, ISelectionContext selectionContext)
    {
        Direction FACING = state.get(HORIZONTAL_FACING);
        Integer CANDLECOUNT = state.get(CANDLES);

        if (FACING == Direction.NORTH && CANDLECOUNT == 1){
            return SHAPE_NORTH;
        }
        else if (FACING == Direction.SOUTH && CANDLECOUNT == 1){
            return SHAPE_SOUTH;
        }
        else if (FACING == Direction.EAST && CANDLECOUNT == 1) {
            return SHAPE_EAST;
        }
        else if (FACING == Direction.WEST && CANDLECOUNT == 1){
            return SHAPE_WEST;
         }
        else  {
            return SHAPE_MULTI;
        }
    }
}