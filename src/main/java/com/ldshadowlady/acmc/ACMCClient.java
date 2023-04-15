package com.ldshadowlady.acmc;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.RegistryObject;

public class ACMCClient {
	public static void init() {
		ACMCBlocks.REG.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			RenderTypeLookup.setRenderLayer(block, RenderType.getTranslucent());
		});
	}
}