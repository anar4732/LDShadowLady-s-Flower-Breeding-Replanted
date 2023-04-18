package com.ldshadowlady.acmc.fabric;

import com.ldshadowlady.acmc.ACMCMod;
import net.fabricmc.api.ModInitializer;

public class ACMCFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ACMCMod.init();
    }
}