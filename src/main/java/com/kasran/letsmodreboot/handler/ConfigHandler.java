package com.kasran.letsmodreboot.handler;

import java.io.File;

import com.kasran.letsmodreboot.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static Configuration cfg;
	public static boolean testValue = false;
	
	public static void init(File configFile) {
		if(cfg == null) {
			cfg = new Configuration(configFile);
		}
		loadConfig();
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfig();
		}
	}
	
	public static void loadConfig() {
		testValue = cfg.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "blah comment");
		if(cfg.hasChanged()) {
			cfg.save();
		}
	}
	
	/*
	public void updateConfig() {
		boolean configValue = false;
		try {
			cfg.load();
			
			// read stuff in from cfg
			configValue = cfg.get("*cries softly into handkerchief*", "configValue", true, "blah comment").getBoolean(true);
		}
		catch(Exception e) {
			// log exception
		}
		finally {
			if(cfg.hasChanged()) cfg.save();
		}
		
		System.out.println(configValue);
	} // */
}
