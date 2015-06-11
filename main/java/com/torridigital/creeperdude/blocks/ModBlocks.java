package com.torridigital.creeperdude.blocks;

import com.torridigital.creeperdude.CreeperTab;
import com.torridigital.creeperdude.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static final CreeperTab tabCreeper = new CreeperTab("tabCreeper");
	
	public static Block mayhemBlock;
	public static Block mayhem_ore;
	public static Block mayhem_multi_ore;

	public static void createBlocks() {
	    GameRegistry.registerBlock(mayhemBlock = new BasicBlock("mayhem_block").setLightLevel(1.0f), "mayhem_block");
	    mayhemBlock.setCreativeTab(tabCreeper);
	    GameRegistry.registerBlock(mayhem_ore = new ModBlockOre("mayhem_ore", Material.rock, ModItems.mayhemItem, 2, 4), "mayhem_ore");
	    mayhem_ore.setCreativeTab(tabCreeper);
		GameRegistry.registerBlock(mayhem_multi_ore = new ModBlockMultiOre("mayhem_multi_ore", Material.rock), "mayhem_multi_ore");
		mayhem_multi_ore.setCreativeTab(tabCreeper);
	}

}
