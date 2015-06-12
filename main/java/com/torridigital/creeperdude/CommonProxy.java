package com.torridigital.creeperdude;

import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.torridigital.creeperdude.ChatItems;
import com.torridigital.creeperdude.blocks.ModBlocks;
import com.torridigital.creeperdude.crafting.ModCrafting;
import com.torridigital.creeperdude.items.ModItems;
import com.torridigital.creeperdude.world.MayhemWorldGenerator;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.createItems();
		ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent event) {
    	ModCrafting.initCrafting();
    	GameRegistry.registerWorldGenerator(new MayhemWorldGenerator(), 0);
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
