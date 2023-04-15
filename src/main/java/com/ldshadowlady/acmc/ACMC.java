package com.ldshadowlady.acmc;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import com.ldshadowlady.acmc.items.ACMCItems;
import com.ldshadowlady.acmc.items.FlowerComposting;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("acmc")
public class ACMC {
	public static final String modid = "acmc";
	private static final Logger LOGGER = LogManager.getLogger();
	
	public ACMC() {
		FMLJavaModLoadingContext.get().getModEventBus().<FMLCommonSetupEvent>addListener(e -> {DeferredWorkQueue.runLater(FlowerComposting::init);});
		ACMCBlocks.REG.register(FMLJavaModLoadingContext.get().getModEventBus());
		ACMCItems.REG.register(FMLJavaModLoadingContext.get().getModEventBus());
		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}
}