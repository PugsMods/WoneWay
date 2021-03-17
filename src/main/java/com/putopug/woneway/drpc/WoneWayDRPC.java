package com.putopug.woneway.drpc;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//
//@author PutoPug
//
@OnlyIn(Dist.CLIENT)
public class WoneWayDRPC {
    private static boolean ready = false;

    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Closing Discord hook.");
            DiscordRPC.discordShutdown();
        }));

        initDiscord();

        int score = 0;
        System.out.println("Running callbacks...");
    }

    private static void initDiscord() {
        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler((user) -> {
            ready = true;
            System.out.println("Welcome " + user.username + "#" + user.discriminator + ".");
            DiscordRichPresence.Builder presence = new DiscordRichPresence.Builder("Fixing Bugs");
            presence.setDetails("Programming - MANIFEST.MF");
            presence.setBigImage("sweetberry_pie","Using Plutonium Build 8.29.38");
            presence.setStartTimestamps(System.currentTimeMillis() / 1000L);
            DiscordRPC.discordUpdatePresence(presence.build());
        }).build();
        DiscordRPC.discordInitialize("786094298268565504", handlers, false);
        DiscordRPC.discordRegister("786094298268565504", "");
    }
}
