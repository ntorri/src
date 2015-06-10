package com.torridigital.creeperdude.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
    public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 1000, 15.0F, 4.0F, 30);

	public static Item tutorialPickaxe;
	public static Item tutorialAxe;
	public static Item tutorialSpade;
	public static Item tutorialHoe;
	public static Item tutorialSword;

	public static Item tutorialMultitool;

	public static void createItems() {
		GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", TUTORIAL), "tutorial_pickaxe");
		GameRegistry.registerItem(tutorialAxe = new ItemModAxe("tutorial_axe", TUTORIAL), "tutorial_axe");
		GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", TUTORIAL), "tutorial_spade");
		GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", TUTORIAL), "tutorial_hoe");
		GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", TUTORIAL), "tutorial_sword");

		GameRegistry.registerItem(tutorialMultitool = new ItemModMultitool("tutorial_multitool", TUTORIAL), "tutorial_multitool");
	}

}
