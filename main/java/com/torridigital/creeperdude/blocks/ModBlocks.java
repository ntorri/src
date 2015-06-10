package com.torridigital.creeperdude.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block tutorialBlock;

	public static void createBlocks() {
	    GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
	}

}
