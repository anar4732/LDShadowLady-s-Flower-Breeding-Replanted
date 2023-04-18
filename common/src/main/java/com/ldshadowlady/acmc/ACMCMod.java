package com.ldshadowlady.acmc;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import com.ldshadowlady.acmc.items.ACMCItems;
import com.ldshadowlady.acmc.items.FlowerComposting;
import dev.architectury.event.events.client.ClientLifecycleEvent;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;

public class ACMCMod {
	public static final String MODID = "acmc";
	
	public static void init() {
		ACMCBlocks.REG.register();
		ACMCItems.REG.register();
		LifecycleEvent.SETUP.register(FlowerComposting::init);
		EnvExecutor.runInEnv(Env.CLIENT, () -> ACMCMod.Client::initializeClient);
//		if (Platform.getEnvironment() == Env.CLIENT) {
//
//		}
	}
	
	@Environment(EnvType.CLIENT)
	public static class Client {
		@Environment(EnvType.CLIENT)
		public static void initializeClient() {
			ClientLifecycleEvent.CLIENT_SETUP.register(ACMCMod.Client::setupClient);
		}
		
		@Environment(EnvType.CLIENT)
		public static void setupClient(Minecraft minecraft) {
			ACMCBlocks.REG.forEach(registrySupplier -> {
				RenderTypeRegistry.register(RenderType.cutout() , registrySupplier.get());
			});
		}
	}
}