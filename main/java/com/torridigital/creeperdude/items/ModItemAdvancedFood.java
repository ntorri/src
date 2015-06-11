package com.torridigital.creeperdude.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModItemAdvancedFood extends ItemFood {

	private List<PotionEffect> effects = new ArrayList<PotionEffect>();
	private List<Double> propabilities = new ArrayList<Double>();

	public ModItemAdvancedFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);

		for (int i = 0; i < this.effects.size(); i++) {
			if (!world.isRemote && this.effects.get(i) != null && this.effects.get(i).getPotionID() > 0 && Math.random() < this.propabilities.get(i))
				player.addPotionEffect(new PotionEffect(this.effects.get(i)));
		}
	}

	public ModItemAdvancedFood addPotionEffect(PotionEffect effect, double propability) {
		this.effects.add(effect);
		this.propabilities.add(propability);
		return this;
	}

	public ModItemAdvancedFood addPotionEffect(PotionEffect effect) {
		return this.addPotionEffect(effect, 1.0);
	}

	public ModItemAdvancedFood removePotionEffect(PotionEffect effect) {
		int index = this.effects.indexOf(effect);
		if (index == -1)
			return this;
		this.effects.remove(index);
		this.propabilities.remove(index);
		return this;
	}

}
