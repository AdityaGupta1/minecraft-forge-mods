package org.devoxx4kids.forge.mods;

import java.util.Random;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppingDiamonds {
	
	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event){
		if (!(event.entity instanceof EntityPig)) {
			return;
		}
		
		Random random = new Random();
		
		event.entity.dropItem(Items.diamond, random.nextInt(3));
	}	
}
