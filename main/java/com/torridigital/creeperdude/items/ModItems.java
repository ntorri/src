package com.torridigital.creeperdude.items;

import com.torridigital.creeperdude.CreeperTab;
import com.torridigital.creeperdude.MainMod;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static final CreeperTab tabCreeper = new CreeperTab("tabCreeper");
	
    public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 1000, 15.0F, 4.0F, 30);
    public static ArmorMaterial TUTORIALA = EnumHelper.addArmorMaterial("TUTORIALA", "mayhem:mayhem", 16, new int[]{3, 8, 6, 3}, 30);

    public static Item mayhemItem;
    public static Item mayhemPickaxe;
	public static Item mayhemAxe;
	public static Item mayhemSpade;
	public static Item mayhemHoe;
	public static Item mayhemSword;

	public static Item mayhemMultitool;
	
	public static Item mayhemHelmet;
	public static Item mayhemChestplate;
	public static Item mayhemLeggings;
	public static Item mayhemBoots;

	public static void createItems() {
		GameRegistry.registerItem(mayhemItem = new BasicItem("mayhem_item"), "mayhem_item");
		mayhemItem.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemPickaxe = new ItemModPickaxe("mayhem_pickaxe", TUTORIAL), "mayhem_pickaxe");
		mayhemPickaxe.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemAxe = new ItemModAxe("mayhem_axe", TUTORIAL), "mayhem_axe");
		mayhemAxe.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemSpade = new ItemModSpade("mayhem_spade", TUTORIAL), "mayhem_spade");
		mayhemSpade.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemHoe = new ItemModHoe("mayhem_hoe", TUTORIAL), "mayhem_hoe");
		mayhemHoe.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemSword = new ItemModSword("mayhem_sword", TUTORIAL), "mayhem_sword");
		mayhemSword.setCreativeTab(tabCreeper);

		GameRegistry.registerItem(mayhemMultitool = new ItemModMultitool("mayhem_multitool", TUTORIAL), "mayhem_multitool");
		mayhemMultitool.setCreativeTab(tabCreeper);
		
		GameRegistry.registerItem(mayhemHelmet = new ItemModArmor("mayhem_helmet", TUTORIALA, 1, 0), "mayhem_helmet");
		mayhemHelmet.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemChestplate = new ItemModArmor("mayhem_chestplate", TUTORIALA, 1, 1), "mayhem_chestplate");
		mayhemChestplate.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemLeggings = new ItemModArmor("mayhem_leggings", TUTORIALA, 2, 2), "mayhem_leggings");
		mayhemLeggings.setCreativeTab(tabCreeper);
		GameRegistry.registerItem(mayhemBoots = new ItemModArmor("mayhem_boots", TUTORIALA, 1, 3), "mayhem_boots");
		mayhemBoots.setCreativeTab(tabCreeper);
	}
	

}
