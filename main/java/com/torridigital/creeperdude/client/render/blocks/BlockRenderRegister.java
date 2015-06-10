package com.torridigital.creeperdude.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.Main;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.torridigital.creeperdude.Reference;
import com.torridigital.creeperdude.blocks.ModBlocks;

public final class BlockRenderRegister {

	public static void registerBlockRenderer() {
		reg(ModBlocks.tutorialBlock);
	}

	public static String modid = Reference.MOD_ID;

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
