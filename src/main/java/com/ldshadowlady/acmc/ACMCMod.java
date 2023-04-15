package com.ldshadowlady.acmc;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import com.ldshadowlady.acmc.items.ACMCItems;
import com.ldshadowlady.acmc.items.FlowerComposting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ACMCMod.MODID)
public class ACMCMod {
	public static final String MODID = "acmc";
	
	public ACMCMod() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.<FMLCommonSetupEvent>addListener(e -> {DeferredWorkQueue.runLater(FlowerComposting::init);});
		modEventBus.addListener(this::onFMLClientSetup);
		ACMCBlocks.REG.register(FMLJavaModLoadingContext.get().getModEventBus());
		ACMCItems.REG.register(FMLJavaModLoadingContext.get().getModEventBus());
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void onFMLClientSetup(FMLClientSetupEvent event) {
		ACMCClient.init();
	}
}