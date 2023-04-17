package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FlowerItemGroup extends ItemGroup {
    public FlowerItemGroup() {
        super("FlowerBreeding");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ACMCBlocks.FLOWER_PINK_POPPY.get());
    }
}