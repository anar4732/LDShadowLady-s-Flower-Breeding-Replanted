package com.ldshadowlady.acmc.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockFlower extends BushBlock {
	private final VoxelShape Shape;
	
	public BlockFlower(Properties properties, VoxelShape ShapeIn) {
		super(properties.offsetType(OffsetType.XZ));
		this.Shape = ShapeIn;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(pos);
		return this.Shape.move(offset.x, offset.y, offset.z);
	}
	
	@Override
	protected MapCodec<? extends BushBlock> codec() {
		return null;
	}
}