package org.devoxx4kids.forge.mods;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	public static final String MODID = "MyMods";
	public static final String VERSION = "1.0";
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
		MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
		MinecraftForge.EVENT_BUS.register(new ChatItems());
		MinecraftForge.EVENT_BUS.register(new PigsDroppingDiamonds());
//		MinecraftForge.EVENT_BUS.register(new SkeletonsFromBones());
		MinecraftForge.EVENT_BUS.register(new ZombieKnights());
		MinecraftForge.EVENT_BUS.register(new CreeperReinforcements());
    }
}
