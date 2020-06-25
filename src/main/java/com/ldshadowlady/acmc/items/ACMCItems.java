package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.*;
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

    public static final RegistryObject<Item> EMPTY_POLLEN_JAR = REG.register("empty_pollen_jar", () -> new EmptyPollenJarItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_ROSE = REG.register("pollen_jar_rose", () -> new PollenJarRedItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_WITHER_ROSE = REG.register("pollen_jar_wither_rose", () -> new PollenJarBlackItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_POPPY = REG.register("pollen_jar_poppy", () -> new PollenJarRedItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_DANDELION = REG.register("pollen_jar_dandelion", () -> new PollenJarYellowItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_ORCHID = REG.register("pollen_jar_orchid", () -> new PollenJarCyanItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_ALLIUM = REG.register("pollen_jar_allium", () -> new PollenJarMagentaItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_AZURE_BLUET = REG.register("pollen_jar_azure_bluet", () -> new PollenJarWhiteItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_RED_TULIP = REG.register("pollen_jar_red_tulip", () -> new PollenJarRedItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_ORANGE_TULIP = REG.register("pollen_jar_orange_tulip", () -> new PollenJarOrangeItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_WHITE_TULIP = REG.register("pollen_jar_white_tulip", () -> new PollenJarWhiteItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_PINK_TULIP = REG.register("pollen_jar_pink_tulip", () -> new PollenJarPinkItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_DAISY = REG.register("pollen_jar_daisy", () -> new PollenJarWhiteItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_CORNFLOWER = REG.register("pollen_jar_cornflower", () -> new PollenJarBlueItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_LILY_OF_THE_VALLEY = REG.register("pollen_jar_lily_of_the_valley", () -> new PollenJarWhiteItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_SUNFLOWER = REG.register("pollen_jar_sunflower", () -> new PollenJarYellowItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_LILAC = REG.register("pollen_jar_lilac", () -> new PollenJarLilacItem(defaultProperties()));
    public static final RegistryObject<Item> POLLEN_JAR_PEONY = REG.register("pollen_jar_peony", () -> new PollenJarPinkItem(defaultProperties()));


    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_ROSE = REG.register("crop_black_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_ROSE = REG.register("crop_blue_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_ROSE = REG.register("crop_cyan_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_ROSE = REG.register("crop_red_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_ROSE = REG.register("crop_magenta_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_ROSE = REG.register("crop_orange_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_ROSE = REG.register("crop_pink_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_ROSE = REG.register("crop_white_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_ROSE = REG.register("crop_yellow_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_ROSE = REG.register("crop_lilac_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_POPPY = REG.register("crop_black_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_POPPY = REG.register("crop_blue_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_POPPY = REG.register("crop_cyan_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_POPPY = REG.register("crop_red_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_POPPY = REG.register("crop_magenta_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_POPPY = REG.register("crop_orange_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_POPPY = REG.register("crop_pink_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_POPPY = REG.register("crop_white_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_POPPY = REG.register("crop_yellow_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_POPPY = REG.register("crop_lilac_poppy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_POPPY));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_DANDELION = REG.register("crop_black_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_DANDELION = REG.register("crop_blue_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_DANDELION = REG.register("crop_cyan_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_DANDELION = REG.register("crop_red_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_DANDELION = REG.register("crop_magenta_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_DANDELION = REG.register("crop_orange_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_DANDELION = REG.register("crop_pink_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_DANDELION = REG.register("crop_white_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_DANDELION = REG.register("crop_yellow_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_DANDELION = REG.register("crop_lilac_dandelion", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_DANDELION));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_ORCHID = REG.register("crop_black_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_BLACK_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_ORCHID = REG.register("crop_blue_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_BLUE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_ORCHID = REG.register("crop_cyan_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_CYAN_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_ORCHID = REG.register("crop_red_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_RED_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_ORCHID = REG.register("crop_magenta_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_MAGENTA_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_ORCHID = REG.register("crop_orange_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_ORANGE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_ORCHID = REG.register("crop_pink_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_PINK_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_ORCHID = REG.register("crop_white_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_WHITE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_ORCHID = REG.register("crop_yellow_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_YELLOW_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_ORCHID = REG.register("crop_lilac_orchid", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_LILAC_ORCHID));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_ALLIUM = REG.register("crop_black_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_ALLIUM = REG.register("crop_blue_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_ALLIUM = REG.register("crop_cyan_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_ALLIUM = REG.register("crop_red_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_ALLIUM = REG.register("crop_magenta_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_ALLIUM = REG.register("crop_orange_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_ALLIUM = REG.register("crop_pink_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_ALLIUM = REG.register("crop_white_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_ALLIUM = REG.register("crop_yellow_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_ALLIUM = REG.register("crop_lilac_allium", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_AZURE_BLUET = REG.register("crop_black_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_AZURE_BLUET = REG.register("crop_blue_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_AZURE_BLUET = REG.register("crop_cyan_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_AZURE_BLUET = REG.register("crop_red_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_AZURE_BLUET = REG.register("crop_magenta_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_AZURE_BLUET = REG.register("crop_orange_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_AZURE_BLUET = REG.register("crop_pink_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_AZURE_BLUET = REG.register("crop_white_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_AZURE_BLUET = REG.register("crop_yellow_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_AZURE_BLUET = REG.register("crop_lilac_azure_bluet", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_TULIP = REG.register("crop_black_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_TULIP = REG.register("crop_blue_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_TULIP = REG.register("crop_cyan_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_TULIP = REG.register("crop_red_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_TULIP = REG.register("crop_magenta_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_TULIP = REG.register("crop_orange_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_TULIP = REG.register("crop_pink_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_TULIP = REG.register("crop_white_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_TULIP = REG.register("crop_yellow_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_TULIP = REG.register("crop_lilac_tulip", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_TULIP));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_DAISY = REG.register("crop_black_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_DAISY = REG.register("crop_blue_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_DAISY = REG.register("crop_cyan_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_DAISY = REG.register("crop_red_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_DAISY = REG.register("crop_magenta_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_DAISY = REG.register("crop_orange_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_DAISY = REG.register("crop_pink_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_DAISY = REG.register("crop_white_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_DAISY = REG.register("crop_yellow_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_DAISY = REG.register("crop_lilac_daisy", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_DAISY));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_CORNFLOWER = REG.register("crop_black_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_CORNFLOWER = REG.register("crop_blue_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_CORNFLOWER = REG.register("crop_cyan_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_CORNFLOWER = REG.register("crop_red_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_CORNFLOWER = REG.register("crop_magenta_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_CORNFLOWER = REG.register("crop_orange_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_CORNFLOWER = REG.register("crop_pink_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_CORNFLOWER = REG.register("crop_white_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_CORNFLOWER = REG.register("crop_yellow_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_CORNFLOWER = REG.register("crop_lilac_cornflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_LILY = REG.register("crop_black_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_BLACK_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_LILY = REG.register("crop_blue_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_BLUE_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_LILY = REG.register("crop_cyan_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_CYAN_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_LILY = REG.register("crop_red_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_RED_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_LILY = REG.register("crop_magenta_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_MAGENTA_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_LILY = REG.register("crop_orange_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_ORANGE_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_LILY = REG.register("crop_pink_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_PINK_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_LILY = REG.register("crop_white_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_WHITE_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_LILY = REG.register("crop_yellow_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_YELLOW_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_LILY = REG.register("crop_lilac_lily", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_LILAC_LILY));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_WITHER_ROSE = REG.register("crop_black_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_WITHER_ROSE = REG.register("crop_blue_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_WITHER_ROSE = REG.register("crop_cyan_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_WITHER_ROSE = REG.register("crop_red_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_WITHER_ROSE = REG.register("crop_magenta_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_WITHER_ROSE = REG.register("crop_orange_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_WITHER_ROSE = REG.register("crop_pink_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_WITHER_ROSE = REG.register("crop_white_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_WITHER_ROSE = REG.register("crop_yellow_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_WITHER_ROSE = REG.register("crop_lilac_wither_rose", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_SUNFLOWER = REG.register("crop_black_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_SUNFLOWER = REG.register("crop_blue_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_SUNFLOWER = REG.register("crop_cyan_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_SUNFLOWER = REG.register("crop_red_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_SUNFLOWER = REG.register("crop_magenta_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_SUNFLOWER = REG.register("crop_orange_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_SUNFLOWER = REG.register("crop_pink_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_SUNFLOWER = REG.register("crop_white_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_SUNFLOWER = REG.register("crop_yellow_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_SUNFLOWER = REG.register("crop_lilac_sunflower", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_LILAC = REG.register("crop_black_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_BLACK_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_LILAC = REG.register("crop_blue_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_BLUE_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_LILAC = REG.register("crop_cyan_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_CYAN_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_LILAC = REG.register("crop_red_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_RED_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_LILAC = REG.register("crop_magenta_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_MAGENTA_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_LILAC = REG.register("crop_orange_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_ORANGE_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_LILAC = REG.register("crop_pink_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_PINK_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_LILAC = REG.register("crop_white_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_WHITE_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_LILAC = REG.register("crop_yellow_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_YELLOW_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_LILAC = REG.register("crop_lilac_lilac", ACMCItems.createVineCropBlockItem(ACMCBlocks.CROP_LILAC_LILAC));
    public static final RegistryObject<ACMCBlockItem> CROP_BLACK_PEONY = REG.register("crop_black_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLACK_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_BLUE_PEONY = REG.register("crop_blue_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_BLUE_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_CYAN_PEONY = REG.register("crop_cyan_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_CYAN_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_RED_PEONY = REG.register("crop_red_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_RED_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_MAGENTA_PEONY = REG.register("crop_magenta_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_MAGENTA_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_ORANGE_PEONY = REG.register("crop_orange_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_ORANGE_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_PINK_PEONY = REG.register("crop_pink_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_PINK_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_WHITE_PEONY = REG.register("crop_white_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_WHITE_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_YELLOW_PEONY = REG.register("crop_yellow_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_YELLOW_PEONY));
    public static final RegistryObject<ACMCBlockItem> CROP_LILAC_PEONY = REG.register("crop_lilac_peony", ACMCItems.createFlowerCropBlockItem(ACMCBlocks.CROP_LILAC_PEONY));

    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_ROSE = REG.register("flower_black_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_ROSE = REG.register("flower_blue_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_ROSE = REG.register("flower_cyan_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_ROSE = REG.register("flower_red_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_ROSE = REG.register("flower_magenta_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_ROSE = REG.register("flower_orange_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_ROSE = REG.register("flower_pink_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_ROSE = REG.register("flower_white_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_ROSE = REG.register("flower_yellow_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_ROSE = REG.register("flower_lilac_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_POPPY = REG.register("flower_black_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_POPPY = REG.register("flower_blue_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_POPPY = REG.register("flower_cyan_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_POPPY = REG.register("flower_red_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_POPPY = REG.register("flower_magenta_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_POPPY = REG.register("flower_orange_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_POPPY = REG.register("flower_pink_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_POPPY = REG.register("flower_white_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_POPPY = REG.register("flower_yellow_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_POPPY = REG.register("flower_lilac_poppy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_POPPY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_DANDELION = REG.register("flower_black_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_DANDELION = REG.register("flower_blue_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_DANDELION = REG.register("flower_cyan_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_DANDELION = REG.register("flower_red_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_DANDELION = REG.register("flower_magenta_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_DANDELION = REG.register("flower_orange_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_DANDELION = REG.register("flower_pink_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_DANDELION = REG.register("flower_white_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_DANDELION = REG.register("flower_yellow_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_DANDELION = REG.register("flower_lilac_dandelion", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_DANDELION));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_ORCHID = REG.register("flower_black_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_ORCHID = REG.register("flower_blue_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_ORCHID = REG.register("flower_cyan_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_ORCHID = REG.register("flower_red_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_RED_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_ORCHID = REG.register("flower_magenta_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_ORCHID = REG.register("flower_orange_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_ORCHID = REG.register("flower_pink_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_PINK_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_ORCHID = REG.register("flower_white_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_ORCHID = REG.register("flower_yellow_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_ORCHID = REG.register("flower_lilac_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_ORCHID));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_ALLIUM = REG.register("flower_black_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_ALLIUM = REG.register("flower_blue_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_ALLIUM = REG.register("flower_cyan_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_ALLIUM = REG.register("flower_red_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_ALLIUM = REG.register("flower_magenta_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_ALLIUM = REG.register("flower_orange_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_ALLIUM = REG.register("flower_pink_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_ALLIUM = REG.register("flower_white_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_ALLIUM = REG.register("flower_yellow_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_ALLIUM = REG.register("flower_lilac_allium", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_ALLIUM));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_AZURE_BLUET = REG.register("flower_black_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_BLACK_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_AZURE_BLUET = REG.register("flower_blue_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_BLUE_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_AZURE_BLUET = REG.register("flower_cyan_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_CYAN_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_AZURE_BLUET = REG.register("flower_red_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_RED_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_AZURE_BLUET = REG.register("flower_magenta_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_MAGENTA_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_AZURE_BLUET = REG.register("flower_orange_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_ORANGE_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_AZURE_BLUET = REG.register("flower_pink_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_PINK_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_AZURE_BLUET = REG.register("flower_white_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_WHITE_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_AZURE_BLUET = REG.register("flower_yellow_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_YELLOW_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_AZURE_BLUET = REG.register("flower_lilac_azure_bluet", ACMCItems.createFlowerCarpetBlockItem(ACMCBlocks.FLOWER_LILAC_AZURE_BLUET));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_TULIP = REG.register("flower_black_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_TULIP = REG.register("flower_blue_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_TULIP = REG.register("flower_cyan_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_TULIP = REG.register("flower_red_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_TULIP = REG.register("flower_magenta_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_TULIP = REG.register("flower_orange_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_TULIP = REG.register("flower_pink_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_TULIP = REG.register("flower_white_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_TULIP = REG.register("flower_yellow_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_TULIP = REG.register("flower_lilac_tulip", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_TULIP));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_DAISY = REG.register("flower_black_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_DAISY = REG.register("flower_blue_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_DAISY = REG.register("flower_cyan_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_DAISY = REG.register("flower_red_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_DAISY = REG.register("flower_magenta_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_DAISY = REG.register("flower_orange_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_DAISY = REG.register("flower_pink_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_DAISY = REG.register("flower_white_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_DAISY = REG.register("flower_yellow_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_DAISY = REG.register("flower_lilac_daisy", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_DAISY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_CORNFLOWER = REG.register("flower_black_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_CORNFLOWER = REG.register("flower_blue_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_CORNFLOWER = REG.register("flower_cyan_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_CORNFLOWER = REG.register("flower_red_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_CORNFLOWER = REG.register("flower_magenta_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_CORNFLOWER = REG.register("flower_orange_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_CORNFLOWER = REG.register("flower_pink_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_CORNFLOWER = REG.register("flower_white_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_CORNFLOWER = REG.register("flower_yellow_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_CORNFLOWER = REG.register("flower_lilac_cornflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_CORNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_LILY = REG.register("flower_black_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_LILY = REG.register("flower_blue_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_LILY = REG.register("flower_cyan_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_LILY = REG.register("flower_red_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_RED_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_LILY = REG.register("flower_magenta_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_LILY = REG.register("flower_orange_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_LILY = REG.register("flower_pink_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_PINK_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_LILY = REG.register("flower_white_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_LILY = REG.register("flower_yellow_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_LILY = REG.register("flower_lilac_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_LILY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_WITHER_ROSE = REG.register("flower_black_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_WITHER_ROSE = REG.register("flower_blue_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_WITHER_ROSE = REG.register("flower_cyan_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_WITHER_ROSE = REG.register("flower_red_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_WITHER_ROSE = REG.register("flower_magenta_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_WITHER_ROSE = REG.register("flower_orange_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_WITHER_ROSE = REG.register("flower_pink_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_WITHER_ROSE = REG.register("flower_white_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_WITHER_ROSE = REG.register("flower_yellow_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_WITHER_ROSE = REG.register("flower_lilac_wither_rose", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_WITHER_ROSE));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_SUNFLOWER = REG.register("flower_black_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_SUNFLOWER = REG.register("flower_blue_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_SUNFLOWER = REG.register("flower_cyan_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_SUNFLOWER = REG.register("flower_red_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_SUNFLOWER = REG.register("flower_magenta_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_SUNFLOWER = REG.register("flower_orange_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_SUNFLOWER = REG.register("flower_pink_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_SUNFLOWER = REG.register("flower_white_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_SUNFLOWER = REG.register("flower_yellow_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_SUNFLOWER = REG.register("flower_lilac_sunflower", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_SUNFLOWER));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_LILAC = REG.register("flower_black_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_LILAC = REG.register("flower_blue_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_LILAC = REG.register("flower_cyan_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_LILAC = REG.register("flower_red_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_RED_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_LILAC = REG.register("flower_magenta_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_LILAC = REG.register("flower_orange_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_LILAC = REG.register("flower_pink_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_PINK_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_LILAC = REG.register("flower_white_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_LILAC = REG.register("flower_yellow_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_LILAC = REG.register("flower_lilac_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_LILAC));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLACK_PEONY = REG.register("flower_black_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLACK_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_BLUE_PEONY = REG.register("flower_blue_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_BLUE_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_CYAN_PEONY = REG.register("flower_cyan_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_CYAN_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_RED_PEONY = REG.register("flower_red_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_RED_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_MAGENTA_PEONY = REG.register("flower_magenta_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_MAGENTA_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_ORANGE_PEONY = REG.register("flower_orange_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_ORANGE_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_PINK_PEONY = REG.register("flower_pink_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_PINK_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_WHITE_PEONY = REG.register("flower_white_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_WHITE_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_YELLOW_PEONY = REG.register("flower_yellow_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_YELLOW_PEONY));
    public static final RegistryObject<ACMCBlockItem> FLOWER_LILAC_PEONY = REG.register("flower_lilac_peony", ACMCItems.createFlowerBlockItem(ACMCBlocks.FLOWER_LILAC_PEONY));

    public static final RegistryObject<ACMCBlockItem> BLACK_CANDLE = REG.register("black_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.BLACK_CANDLE));
    public static final RegistryObject<ACMCBlockItem> BLUE_CANDLE = REG.register("blue_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.BLUE_CANDLE));
    public static final RegistryObject<ACMCBlockItem> CYAN_CANDLE = REG.register("cyan_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.CYAN_CANDLE));
    public static final RegistryObject<ACMCBlockItem> GREEN_CANDLE = REG.register("green_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.GREEN_CANDLE));
    public static final RegistryObject<ACMCBlockItem> ORANGE_CANDLE = REG.register("orange_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.ORANGE_CANDLE));
    public static final RegistryObject<ACMCBlockItem> PINK_CANDLE = REG.register("pink_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.PINK_CANDLE));
    public static final RegistryObject<ACMCBlockItem> RED_CANDLE = REG.register("red_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.RED_CANDLE));
    public static final RegistryObject<ACMCBlockItem> WHITE_CANDLE = REG.register("white_candle", ACMCItems.createCandleBlockItem(ACMCBlocks.WHITE_CANDLE));


    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_BLACK_LILAC = REG.register("stunted_flower_black_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_BLACK_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_BLUE_LILAC = REG.register("stunted_flower_blue_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_BLUE_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_CYAN_LILAC = REG.register("stunted_flower_cyan_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_CYAN_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_RED_LILAC = REG.register("stunted_flower_red_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_RED_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_MAGENTA_LILAC = REG.register("stunted_flower_magenta_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_MAGENTA_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_ORANGE_LILAC = REG.register("stunted_flower_orange_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_ORANGE_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_PINK_LILAC = REG.register("stunted_flower_pink_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_PINK_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_WHITE_LILAC = REG.register("stunted_flower_white_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_WHITE_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_YELLOW_LILAC = REG.register("stunted_flower_yellow_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_YELLOW_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_LILAC_LILAC = REG.register("stunted_flower_lilac_lilac", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_LILAC_LILAC));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_BLACK_LILY = REG.register("stunted_flower_black_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_BLACK_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_BLUE_LILY = REG.register("stunted_flower_blue_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_BLUE_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_CYAN_LILY = REG.register("stunted_flower_cyan_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_CYAN_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_RED_LILY = REG.register("stunted_flower_red_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_RED_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_MAGENTA_LILY = REG.register("stunted_flower_magenta_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_MAGENTA_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_ORANGE_LILY = REG.register("stunted_flower_orange_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_ORANGE_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_PINK_LILY = REG.register("stunted_flower_pink_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_PINK_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_WHITE_LILY = REG.register("stunted_flower_white_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_WHITE_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_YELLOW_LILY = REG.register("stunted_flower_yellow_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_YELLOW_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_LILAC_LILY = REG.register("stunted_flower_lilac_lily", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_LILAC_LILY));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_BLACK_ORCHID = REG.register("stunted_flower_black_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_BLACK_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_BLUE_ORCHID = REG.register("stunted_flower_blue_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_BLUE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_CYAN_ORCHID = REG.register("stunted_flower_cyan_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_CYAN_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_RED_ORCHID = REG.register("stunted_flower_red_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_RED_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_MAGENTA_ORCHID = REG.register("stunted_flower_magenta_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_MAGENTA_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_ORANGE_ORCHID = REG.register("stunted_flower_orange_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_ORANGE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_PINK_ORCHID = REG.register("stunted_flower_pink_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_PINK_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_WHITE_ORCHID = REG.register("stunted_flower_white_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_WHITE_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_YELLOW_ORCHID = REG.register("stunted_flower_yellow_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_YELLOW_ORCHID));
    public static final RegistryObject<ACMCBlockItem> STUNTED_FLOWER_LILAC_ORCHID = REG.register("stunted_flower_lilac_orchid", ACMCItems.createVineFlowerBlockItem(ACMCBlocks.STUNTED_FLOWER_LILAC_ORCHID));
    public static final ItemGroup FlowerBreeding = new FlowerItemGroup("FlowerBreeding");
    private static Item.Properties defaultProperties() {return new Item.Properties().group(FlowerBreeding);
    }


    private static Supplier<ACMCBlockItem> createFlowerCropBlockItem ( final RegistryObject<BlockFlowerCrop> block){
        return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }

    private static Supplier<ACMCBlockItem> createFlowerBlockItem ( final RegistryObject<BlockFlower> block){
        return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }

    private static Supplier<ACMCBlockItem> createFlowerCarpetBlockItem ( final RegistryObject<BlockFlowerCarpet> block){
        return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }

    private static Supplier<ACMCBlockItem> createVineFlowerBlockItem ( final RegistryObject<BlockVineFlower> block){
        return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }

    private static Supplier<ACMCBlockItem> createVineCropBlockItem ( final RegistryObject<BlockFlowerVineCrop> block){
        return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }

    private static Supplier<ACMCBlockItem> createCandleBlockItem ( final RegistryObject<BlockCandle> block){
        return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }
    
    private static Supplier<ACMCBlockItem> createRotate90BlockItem ( final RegistryObject<BlockRotate90> block){
        return () -> new ACMCBlockItem(block.orElseThrow(IllegalStateException::new), defaultProperties().maxStackSize(64));
    }

}