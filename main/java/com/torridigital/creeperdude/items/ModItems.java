package com.torridigital.creeperdude.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
    public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 1000, 15.0F, 4.0F, 30);
    public static ArmorMaterial TUTORIALA = EnumHelper.addArmorMaterial("TUTORIALA", "tutorial:tutorial", 16, new int[]{3, 8, 6, 3}, 30);

    public static Item tutorialItem;
    public static Item tutorialPickaxe;
	public static Item tutorialAxe;
	public static Item tutorialSpade;
	public static Item tutorialHoe;
	public static Item tutorialSword;

	public static Item tutorialMultitool;
	
	public static Item tutorialHelmet;
	public static Item tutorialChestplate;
	public static Item tutorialLeggings;
	public static Item tutorialBoots;

	public static void createItems() {
		GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", TUTORIAL), "tutorial_pickaxe");
		GameRegistry.registerItem(tutorialAxe = new ItemModAxe("tutorial_axe", TUTORIAL), "tutorial_axe");
		GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", TUTORIAL), "tutorial_spade");
		GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", TUTORIAL), "tutorial_hoe");
		GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", TUTORIAL), "tutorial_sword");

		GameRegistry.registerItem(tutorialMultitool = new ItemModMultitool("tutorial_multitool", TUTORIAL), "tutorial_multitool");
		
		GameRegistry.registerItem(tutorialHelmet = new ItemModArmor("tutorial_helmet", TUTORIALA, 1, 0), "tutorial_helmet");
		GameRegistry.registerItem(tutorialChestplate = new ItemModArmor("tutorial_chestplate", TUTORIALA, 1, 1), "tutorial_chestplate");
		GameRegistry.registerItem(tutorialLeggings = new ItemModArmor("tutorial_leggings", TUTORIALA, 2, 2), "tutorial_leggings");
		GameRegistry.registerItem(tutorialBoots = new ItemModArmor("tutorial_boots", TUTORIALA, 1, 3), "tutorial_boots");
	}

}
