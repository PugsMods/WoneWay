package com.putopug.woneway;

import com.putopug.woneway.init.WoneWayBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("woneway")
public class WoneWay {
    public static final String MOD_ID = "woneway";

    public WoneWay() {
        MinecraftForge.EVENT_BUS.register(this);
        WoneWayBlocks.init();
    }
}
