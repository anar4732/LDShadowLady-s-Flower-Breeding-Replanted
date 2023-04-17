package com.ldshadowlady.acmc;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.registries.RegistryObject;

public class ACMCClient {
	public static void init() {
		ACMCBlocks.REG.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		});
	}
}