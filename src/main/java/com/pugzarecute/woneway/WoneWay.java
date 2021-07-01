package com.pugzarecute.woneway;

import com.pugzarecute.woneway.init.WoneWayBlocks;
import net.minecraftforge.fml.common.Mod;

@Mod("woneway")
public class WoneWay {
    public static final String MOD_ID = "woneway";

    public WoneWay() {
        WoneWayBlocks.init();
    }
}
