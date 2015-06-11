package com.torridigital.creeperdude.crafting;

import com.torridigital.creeperdude.blocks.ModBlocks;
import com.torridigital.creeperdude.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mayhemBlock),	"##","##",	'#', ModItems.mayhemItem);
		//or: GameRegistry.addRecipe(new ItemStack(ModBlocks.mayhemBlock), new Object[]{"##","##", '#', ModItems.mayhemItem});

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mayhemItem), Items.redstone, new ItemStack(Items.dye, 1, 4));
		//or: GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mayhemItem), new Object[]{Items.redstone, new ItemStack(Items.dye, 1, 4)});

		GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.mayhemItem), 1.0f);
	}

}
