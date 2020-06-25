package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FlowerItemGroup extends ItemGroup {

    public FlowerItemGroup(String label) {
        super("FlowerBreeding");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ACMCBlocks.FLOWER_PINK_POPPY.get());
    }
}
