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
