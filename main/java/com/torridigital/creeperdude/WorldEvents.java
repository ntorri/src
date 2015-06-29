package com.torridigital.creeperdude;

import java.util.Map;

import net.minecraft.world.GameRules;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WorldEvents {
	@SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        GameRules gRules = event.world.getGameRules();

        for (Map.Entry<String, Boolean> entry : MainMod.instance.config.rules.entrySet()) {
            String rule = entry.getKey();
            Boolean state = entry.getValue();
            gRules.setOrCreateGameRule(rule, state ? "true" : "false");
        }

    }

    @SubscribeEvent
    public void onWorldUnLoad(WorldEvent.Unload event) {
        GameRules gRules = event.world.getGameRules();

        for (Map.Entry<String, Boolean> entry : MainMod.instance.config.rules.entrySet()) {
            String rule = entry.getKey();
            Boolean state = gRules.getGameRuleBooleanValue(rule);

            MainMod.instance.config.rules.put(rule, state);
        }

        MainMod.instance.config.saveConfig();
    }

}
