package com.torridigital.creeperdude;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.torridigital.creeperdude.blocks.ModBlocks;
import com.torridigital.creeperdude.crafting.ModCrafting;
import com.torridigital.creeperdude.items.ModItems;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.createItems();
		ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent event) {
    	ModCrafting.initCrafting();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
