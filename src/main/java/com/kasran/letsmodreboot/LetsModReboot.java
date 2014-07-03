package com.kasran.letsmodreboot;

import com.kasran.letsmodreboot.handler.ConfigHandler;
import com.kasran.letsmodreboot.proxy.IProxy;
import com.kasran.letsmodreboot.reference.Reference;
import com.kasran.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = "1.7.10-1.0", guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {
	
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;  // reliable instance of this mod
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent stuffHappening) {
		//  load configs, network stuff, items, and blocks here
		ConfigHandler.init(stuffHappening.getSuggestedConfigurationFile());
		LogHelper.info("Pre-init completed");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent stuffHappening) {
		// register GUIs, tile entities, recipes, event handlers here
		LogHelper.info("Init completed");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent stuffHappening) {
		// wrap stuff up, run after all mods have initialized
		LogHelper.info("Post-init completed");
	}
}
