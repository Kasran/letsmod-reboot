package com.kasran.letsmodreboot.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration cfg = new Configuration(configFile);
		try {
			cfg.load();
			
			// read stuff in from cfg
		}
		catch(Exception e) {
			// log exception
		}
		finally {
			cfg.save();
		}
	}
}
