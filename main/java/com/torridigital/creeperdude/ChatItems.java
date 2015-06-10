package com.torridigital.creeperdude;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatItems {

	@SubscribeEvent
	public void giveItems(ServerChatEvent event){
	if (event.message.contains("beastmode")) {
	ItemStack sword = new ItemStack(Items.diamond_sword, 1);
		sword.addEnchantment(Enchantment.baneOfArthropods, 5);
		sword.addEnchantment(Enchantment.knockback, 2);
		sword.addEnchantment(Enchantment.looting, 3);
		sword.addEnchantment(Enchantment.sharpness, 5);
		sword.addEnchantment(Enchantment.smite, 5);
		sword.addEnchantment(Enchantment.unbreaking, 3);
	event.player.inventory.addItemStackToInventory(sword);
	ItemStack bow = new ItemStack(Items.bow, 1);
		bow.addEnchantment(Enchantment.infinity, 1);
		bow.addEnchantment(Enchantment.flame, 1);
		bow.addEnchantment(Enchantment.power, 5);
		bow.addEnchantment(Enchantment.punch, 2);
		bow.addEnchantment(Enchantment.unbreaking, 3);
	event.player.inventory.addItemStackToInventory(bow);
	ItemStack pickaxe = new ItemStack(Items.diamond_pickaxe, 1);
		pickaxe.addEnchantment(Enchantment.efficiency, 5);
		pickaxe.addEnchantment(Enchantment.fortune, 3);
		pickaxe.addEnchantment(Enchantment.silkTouch, 1);
		pickaxe.addEnchantment(Enchantment.unbreaking, 3);
	event.player.inventory.addItemStackToInventory(pickaxe);
	ItemStack axe = new ItemStack(Items.diamond_axe, 1);
		axe.addEnchantment(Enchantment.efficiency, 5);
		axe.addEnchantment(Enchantment.fortune, 3);
		axe.addEnchantment(Enchantment.silkTouch, 1);
		axe.addEnchantment(Enchantment.unbreaking, 3);
	event.player.inventory.addItemStackToInventory(axe);
	ItemStack shovel = new ItemStack(Items.diamond_shovel, 1);
		shovel.addEnchantment(Enchantment.efficiency, 5);
		shovel.addEnchantment(Enchantment.fortune, 3);
		shovel.addEnchantment(Enchantment.silkTouch, 1);
		shovel.addEnchantment(Enchantment.unbreaking, 3);
	event.player.inventory.addItemStackToInventory(shovel);
	ItemStack rod = new ItemStack(Items.fishing_rod, 1);
		rod.addEnchantment(Enchantment.luckOfTheSea, 3);
		rod.addEnchantment(Enchantment.lure, 3);
		rod.addEnchantment(Enchantment.unbreaking, 3);
	event.player.inventory.addItemStackToInventory(rod);
	ItemStack helmet = new ItemStack(Items.diamond_helmet, 1);
		helmet.addEnchantment(Enchantment.aquaAffinity, 1);
		helmet.addEnchantment(Enchantment.blastProtection, 4);
		helmet.addEnchantment(Enchantment.fireProtection, 4);
		helmet.addEnchantment(Enchantment.projectileProtection, 4);
		helmet.addEnchantment(Enchantment.protection, 4);
		helmet.addEnchantment(Enchantment.respiration, 3);
		helmet.addEnchantment(Enchantment.unbreaking, 3);
		event.player.setCurrentItemOrArmor(4, helmet);
	ItemStack chestplate = new ItemStack(Items.diamond_chestplate, 1);
		chestplate.addEnchantment(Enchantment.blastProtection, 4);
		chestplate.addEnchantment(Enchantment.fireProtection, 4);
		chestplate.addEnchantment(Enchantment.projectileProtection, 4);
		chestplate.addEnchantment(Enchantment.protection, 4);
		chestplate.addEnchantment(Enchantment.thorns, 3);
		chestplate.addEnchantment(Enchantment.unbreaking, 3);
		event.player.setCurrentItemOrArmor(3, chestplate);
	ItemStack leggings = new ItemStack(Items.diamond_leggings, 1);
		leggings.addEnchantment(Enchantment.blastProtection, 4);
		leggings.addEnchantment(Enchantment.fireProtection, 4);
		leggings.addEnchantment(Enchantment.projectileProtection, 4);
		leggings.addEnchantment(Enchantment.protection, 4);
		leggings.addEnchantment(Enchantment.unbreaking, 3);
		event.player.setCurrentItemOrArmor(2, leggings);
	ItemStack boots = new ItemStack(Items.diamond_boots, 1);
		boots.addEnchantment(Enchantment.blastProtection, 4);
		boots.addEnchantment(Enchantment.depthStrider, 3);
		boots.addEnchantment(Enchantment.featherFalling, 4);
		boots.addEnchantment(Enchantment.fireProtection, 4);
		boots.addEnchantment(Enchantment.projectileProtection, 4);
		boots.addEnchantment(Enchantment.protection, 4);
		boots.addEnchantment(Enchantment.unbreaking, 3);
		event.player.setCurrentItemOrArmor(1, boots);
		event.player.inventory.addItemStackToInventory(new ItemStack(Items.cooked_beef, 64));
		event.player.inventory.addItemStackToInventory(new ItemStack(Items.arrow, 1));
	event.player.addPotionEffect(new PotionEffect(1, 1000000, 5));
	event.player.addPotionEffect(new PotionEffect(5, 1000000, 5));
	event.player.addPotionEffect(new PotionEffect(11, 1000000, 3));
	event.player.addExperienceLevel(32);
		}
	}
}