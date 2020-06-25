package com.ldshadowlady.acmc.blocks;

import com.ldshadowlady.acmc.items.ACMCItems;
import net.minecraft.block.*;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;


public class BlockFlower extends BushBlock {
    private final VoxelShape Shape;

    public BlockFlower(Properties properties, VoxelShape ShapeIn) {
        super(properties);
        this.Shape = ShapeIn;
    }

    public OffsetType getOffsetType() {

        return OffsetType.XZ;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        Vec3d offset = state.getOffset(world, pos);
        return this.Shape.withOffset(offset.x, offset.y, offset.z);
    }

}