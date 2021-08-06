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

package com.pugzarecute.woneway.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;

public class Utils {
    private static final long WINDOW = Minecraft.getInstance().getWindow().getWindow();

    private static final Logger LOGGER = LogManager.getLogger();

    public static long startTimeMills;

    public static void timerInit() {
        startTimeMills = System.currentTimeMillis();
        LOGGER.debug("Timer started");
    }

    public static void timeRan(){
        LOGGER.debug("Process has been running for "+(startTimeMills-System.currentTimeMillis())+"ms");
    }

    public static boolean isKeyDepressed(int keyIn){
        if(FMLEnvironment.dist == Dist.CLIENT){
            return InputConstants.isKeyDown(WINDOW,keyIn);
        }else return false;
    }
}
