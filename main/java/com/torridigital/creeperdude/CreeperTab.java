package com.torridigital.creeperdude;

import com.torridigital.creeperdude.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreeperTab extends CreativeTabs {
	
	public CreeperTab(String label) {
		super(label);
		this.setBackgroundImageName("tab_mayhem.png");
	}
	@Override
	public Item getTabIconItem() {
		return ModItems.mayhemItem;
	}

}
