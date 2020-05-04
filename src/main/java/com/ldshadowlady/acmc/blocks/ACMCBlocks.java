package com.ldshadowlady.acmc.blocks;

import com.ldshadowlady.acmc.ACMC;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.ldshadowlady.acmc.ACMC.modid;

public final class ACMCBlocks {
    private ACMCBlocks() {}
    public static final DeferredRegister<Block> REG = new DeferredRegister<>(ForgeRegistries.BLOCKS, modid);

    public static final RegistryObject<BlockImperialChest> BROWN_IMPERIAL_CHEST = REG.register("brown_imperial_chest", () -> new BlockImperialChest(Block.Properties.create(Material.WOOD)));







}