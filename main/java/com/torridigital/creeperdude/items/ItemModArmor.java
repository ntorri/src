package com.torridigital.creeperdude.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModArmor extends ItemArmor {

	public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);

		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (itemStack.getItem() == ModItems.tutorialHelmet) {
			this.effectPlayer(player, Potion.nightVision, 0);
		}
		if (itemStack.getItem() == ModItems.tutorialChestplate) {
			this.effectPlayer(player, Potion.digSpeed, 0);
		}
		if (itemStack.getItem() == ModItems.tutorialLeggings) {
			this.effectPlayer(player, Potion.moveSpeed, 0);
		}
		if (itemStack.getItem() == ModItems.tutorialBoots) {
			this.effectPlayer(player, Potion.jump, 1);
		}

		if (this.isWearingFullSet(player, ModItems.tutorialHelmet, ModItems.tutorialChestplate, ModItems.tutorialLeggings, ModItems.tutorialBoots)) {
			this.effectPlayer(player, Potion.regeneration, 1);
		}
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
		//Always effect for 8 seconds, then refresh
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}

	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
	}

}
