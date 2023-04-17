package com.ldshadowlady.acmc.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockFlowerVineCrop extends CropBlock {
	protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 5.0D, 15.0D, 16.0D, 10.0D);
	
	public BlockFlowerVineCrop(Properties properties) {
		super(properties);
	}
	
	@Override
	protected ItemLike getBaseSeedId() {
		return Blocks.AIR;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}
}