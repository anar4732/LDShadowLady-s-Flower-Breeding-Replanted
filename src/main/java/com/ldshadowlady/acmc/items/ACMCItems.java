package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import com.ldshadowlady.acmc.blocks.BlockImperialChest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

import static com.ldshadowlady.acmc.ACMC.modid;

public final class ACMCItems {
    private ACMCItems() {
    }

    public static final DeferredRegister<Item> REG = new DeferredRegister<>(ForgeRegistries.ITEMS, modid);

    public static final RegistryObject<ACMCBlockItem> BROWN_IMPERIAL_CHEST = REG.register("brown_imperial_chest", ACMCItems.createBlockItem(ACMCBlocks.BROWN_IMPERIAL_CHEST));

    private static Item.Properties defaultProperties() {
        return new Item.Properties().group(ItemGroup.DECORATIONS);
    }
        private static Supplier<ACMCBlockItem> createBlockItem ( final RegistryObject<BlockImperialChest> block){
            return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }

}