package com.ldshadowlady.acmc.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockFlowerCarpet extends BushBlock {
	public BlockFlowerCarpet(Properties p_i48440_1_) {
		super(p_i48440_1_);
	}
	
	@Override
	public OffsetType getOffsetType() {
		return OffsetType.XZ;
	}
	
	protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
		return SHAPE;
	}
}