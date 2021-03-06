/*
 * This file is part of WoneWay.
 *
 * WoneWay is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WoneWay is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WoneWay.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.pugzarecute.woneway;

import com.pugzarecute.woneway.init.WoneWayBlocks;
import com.pugzarecute.woneway.utils.TimerRunnable;
import com.pugzarecute.woneway.utils.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(WoneWay.MOD_ID)
public class WoneWay {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "woneway";

    public WoneWay() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        WoneWayBlocks.init();
    }

    private void setup(final FMLCommonSetupEvent event) {
        Runtime.getRuntime().addShutdownHook(new Thread(new TimerRunnable()));
        LOGGER.debug("Starting timer");
        Utils.timerInit();
        LOGGER.debug("Debug Info: Java version: " + System.getProperty("java.version") + " Java VM Version: " + System.getProperty("java.vm.version") + "(Java VM Vendor: " + System.getProperty("java.vendor") + ") System Architecture: " + System.getProperty("os.arch"));

    }
}
