package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FlowerItemGroup extends CreativeModeTab {
    public FlowerItemGroup() {
        super("FlowerBreeding");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ACMCBlocks.FLOWER_PINK_POPPY.get());
    }
}