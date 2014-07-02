package com.kasran.letsmodreboot.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration cfg = new Configuration(configFile);
		
		boolean configValue;
		try {
			cfg.load();
			
			// read stuff in from cfg
			configValue = cfg.get(Configuration.CATEGORY_GENERAL, "configValue", true, "blah comment").getBoolean(true);
		}
		catch(Exception e) {
			// log exception
		}
		finally {
			cfg.save();
		}
		
		System.out.println(configValue);
	}
}
