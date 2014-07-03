package com.kasran.letsmodreboot.client.gui;

import java.util.List;

import com.kasran.letsmodreboot.handler.ConfigHandler;
import com.kasran.letsmodreboot.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen parentScreen) {
		super(parentScreen,
				new ConfigElement(ConfigHandler.cfg.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false, false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.cfg.toString()));
	}

}
