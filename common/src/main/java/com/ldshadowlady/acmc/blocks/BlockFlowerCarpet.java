package com.ldshadowlady.acmc.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class BlockFlowerCarpet extends BushBlock {
	protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
	
	public BlockFlowerCarpet(Properties properties) {
		super(properties.offsetType(OffsetType.XZ));
	}
	
	@Override
	public @NotNull VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
		return SHAPE;
	}
	
	@Override
	protected MapCodec<? extends BushBlock> codec() {
		return null;
	}
}