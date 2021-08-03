package com.pugzarecute.woneway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {
    private static final Logger LOGGER = LogManager.getLogger();
    public static long startTimeMills;
    public static void timerInit() {
        startTimeMills = System.currentTimeMillis();
        LOGGER.debug("Timer started");
    }
}
