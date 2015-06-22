package com.torridigital.creeperdude;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class MainMod {

	@Instance
	    public static MainMod instance = new MainMod();
	 
	@SidedProxy(clientSide="com.torridigital.creeperdude.ClientProxy", serverSide="com.torridigital.creeperdude.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		this.proxy.preInit(event);
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		this.proxy.init(event);
		MinecraftForge.EVENT_BUS.register(new ChatItems());
		// MinecraftForge.EVENT_BUS.register(new DragonSpawner());
		// MinecraftForge.EVENT_BUS.register(new BreakBlockMessage());
		// MinecraftForge.EVENT_BUS.register(new SpawnAlert());
		// MinecraftForge.EVENT_BUS.register(new SharpSnowballs());
		MinecraftForge.EVENT_BUS.register(new OverpoweredIronGolems());
		// MinecraftForge.EVENT_BUS.register(new RainWater());
		// FMLCommonHandler.instance().bus().register(new WallClimber());
		// MinecraftForge.EVENT_BUS.register(new WallClimber());
		// MinecraftForge.EVENT_BUS.register(new ArrowShotgun());
		MinecraftForge.EVENT_BUS.register(new SkeletonWar());
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		this.proxy.postInit(event);
	}
	
}
