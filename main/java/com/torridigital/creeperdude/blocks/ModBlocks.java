package com.torridigital.creeperdude.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block mayhemBlock;

	public static void createBlocks() {
	    GameRegistry.registerBlock(mayhemBlock = new BasicBlock("mayhem_block").setLightLevel(1.0f), "mayhem_block");
	}

}
