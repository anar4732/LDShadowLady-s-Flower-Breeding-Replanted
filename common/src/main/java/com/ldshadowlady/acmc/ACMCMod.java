package com.ldshadowlady.acmc;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import com.ldshadowlady.acmc.items.ACMCItems;
import com.ldshadowlady.acmc.items.FlowerComposting;
import dev.architectury.event.events.client.ClientLifecycleEvent;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ACMCMod {
	public static final String MODID = "acmc";
	
	public static final DeferredRegister<CreativeModeTab> REG_TABS = DeferredRegister.create(MODID, Registries.CREATIVE_MODE_TAB);
	
	public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB = REG_TABS.register("flowerbreeding", () ->
			CreativeTabRegistry.create(Component.literal("Flower Breeding"), () ->
					new ItemStack(ACMCBlocks.FLOWER_PINK_POPPY.get())));
	
	public static void init() {
		REG_TABS.register();
		ACMCBlocks.BLOCKS.register();
		ACMCItems.REG.register();
		LifecycleEvent.SETUP.register(FlowerComposting::init);
		EnvExecutor.runInEnv(Env.CLIENT, () -> ACMCMod.Client::initializeClient);
//		if (Platform.getEnvironment() == Env.CLIENT) {}
	}
	
	@Environment(EnvType.CLIENT)
	public static class Client {
		@Environment(EnvType.CLIENT)
		public static void initializeClient() {
			ClientLifecycleEvent.CLIENT_SETUP.register(ACMCMod.Client::setupClient);
		}
		
		@Environment(EnvType.CLIENT)
		public static void setupClient(Minecraft minecraft) {
			ACMCBlocks.BLOCKS.forEach(registrySupplier -> {
				RenderTypeRegistry.register(RenderType.cutout() , registrySupplier.get());
			});
		}
	}
}