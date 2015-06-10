package com.torridigital.creeperdude;

import java.util.List;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SpawnAlert {

	@SubscribeEvent
	public void sendAlert(EntityJoinWorldEvent event) {
		if (!(event.entity instanceof EntityWither)) {
			return;
		}

		List players = event.entity.worldObj.playerEntities;

		for (int i = 0; i < players.size(); i++) {
			EntityPlayer player = (EntityPlayer) players.get(i);
			if (event.world.isRemote) {
				player.addChatMessage(new ChatComponentText(
						EnumChatFormatting.DARK_GRAY + "A Wither has spawned!"));
			}
		}
	}

}
