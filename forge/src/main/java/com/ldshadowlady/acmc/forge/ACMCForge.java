package com.ldshadowlady.acmc.forge;

import com.ldshadowlady.acmc.ACMCMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ACMCMod.MODID)
public class ACMCForge {
    public ACMCForge() {
        EventBuses.registerModEventBus(ACMCMod.MODID, FMLJavaModLoadingContext.get().getModEventBus());
	    ACMCMod.init();
    }
}