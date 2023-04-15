package com.ldshadowlady.acmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import static net.minecraft.state.properties.BlockStateProperties.LIT;

public class BlockLamp extends HorizontalBlock {
	//xMin, yMin, zMin, xMax, yMax, zMax); //all decimals
	protected static final VoxelShape SHAPE_EAST = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 13.0D, 13.0D);
	protected static final VoxelShape SHAPE_WEST = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 13.0D, 13.0D);
	protected static final VoxelShape SHAPE_NORTH = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 13.0D, 13.0D);
	protected static final VoxelShape SHAPE_SOUTH = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 13.0D, 13.0D);
	
	public BlockLamp(Properties properties) {
		super(properties);
		this.setDefaultState((this.stateContainer.getBaseState()).with(LIT, false).with(HORIZONTAL_FACING, Direction.SOUTH));
	}
	
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		activate(state, worldIn, pos);
		return true;
	}
	
	private static void activate(BlockState blockstate, World worldIn, BlockPos pos) {
		if (!blockstate.get(LIT)) {
			worldIn.setBlockState(pos, blockstate.with(LIT, Boolean.valueOf(true)));
		} else {
			worldIn.setBlockState(pos, blockstate.with(LIT, Boolean.valueOf(false)));
		}
	}
	
	@Override
	public int getLightValue(BlockState blockstate) {
		return blockstate.get(LIT) ? super.getLightValue(blockstate) : 0;
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> p_206840_1_) {
		p_206840_1_.add(new IProperty[] { HORIZONTAL_FACING, LIT });
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(LIT, false).with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing());
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader blockReader, BlockPos pos, ISelectionContext selectionContext) {
		Direction DIRECTION_FACING = state.get(HORIZONTAL_FACING);
		
		switch (DIRECTION_FACING) {
			case NORTH:
				return SHAPE_NORTH;
			case EAST:
				return SHAPE_EAST;
			case WEST:
				return SHAPE_WEST;
			default:
				return SHAPE_SOUTH;
		}
	}
	
}