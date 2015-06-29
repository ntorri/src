package com.torridigital.creeperdude.config;

import com.torridigital.creeperdude.MainMod;
import com.torridigital.creeperdude.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

public class GGRConfigGUI extends GuiConfig {

    public GGRConfigGUI(GuiScreen parentScreen) {
        super(parentScreen,
                new ConfigElement(MainMod.instance.config.getCategory(MainMod.instance.config.CATEGORY_GAMERULES)).getChildElements(),
                Reference.MOD_ID, true, false, GuiConfig.getAbridgedConfigPath(MainMod.instance.config.toString()));
    }

}
