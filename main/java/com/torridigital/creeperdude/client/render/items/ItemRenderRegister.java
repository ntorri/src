package com.torridigital.creeperdude.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.main.Main;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.torridigital.creeperdude.MainMod;
import com.torridigital.creeperdude.Reference;
import com.torridigital.creeperdude.items.ModItems;

public final class ItemRenderRegister {

	public static void preInit() {
	}

	public static void registerItemRenderer() {
		reg(ModItems.tutorialPickaxe);
		reg(ModItems.tutorialAxe);
		reg(ModItems.tutorialSpade);
		reg(ModItems.tutorialHoe);
		reg(ModItems.tutorialSword);
		reg(ModItems.tutorialMultitool);
		
		reg(ModItems.tutorialHelmet);
		reg(ModItems.tutorialChestplate);
		reg(ModItems.tutorialLeggings);
		reg(ModItems.tutorialBoots);
		reg(ModItems.tutorialItem);
	}

	// ==========================================================================

	public static String modid = Reference.MOD_ID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void reg(Item item, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
}
