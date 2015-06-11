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
		reg(ModItems.mayhemPickaxe);
		reg(ModItems.mayhemAxe);
		reg(ModItems.mayhemSpade);
		reg(ModItems.mayhemHoe);
		reg(ModItems.mayhemSword);
		reg(ModItems.mayhemMultitool);
		
		reg(ModItems.mayhemHelmet);
		reg(ModItems.mayhemChestplate);
		reg(ModItems.mayhemLeggings);
		reg(ModItems.mayhemBoots);
		reg(ModItems.mayhemItem);
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
