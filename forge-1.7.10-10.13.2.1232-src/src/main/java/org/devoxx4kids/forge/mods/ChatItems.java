package org.devoxx4kids.forge.mods;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ServerChatEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ChatItems {
	
	@SubscribeEvent
	public void giveItems(ServerChatEvent event){
		if (!(event.message.contains("potato"))) {
			return;
		}
		
		event.player.inventory.addItemStackToInventory(new ItemStack(Items.potato, 64));
	}
}
