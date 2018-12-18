package com.rzheng.eggsplosion.managers;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class ConfigManager 
{
	private static boolean initialized;
	private static ConfigManager instance;
	
	private Plugin plugin;
	private FileConfiguration config;
	
	private ConfigManager(Plugin plugin)
	{
		this.plugin = plugin;
		loadConfig();
	}
	
	private void loadConfig()
	{
		verifyFile();
		this.plugin.reloadConfig();
		this.config = this.plugin.getConfig();
	}
	
	private void verifyFile()
	{
		File file = new File(this.plugin.getDataFolder(), "config.yml");
		if(!file.exists())
		{
			this.plugin.saveDefaultConfig();
		}
	}
	
	public static void initialize(Plugin plugin)
	{
		if(!initialized)
		{
			instance = new ConfigManager(plugin);
			initialized = true;
		}
	}
	
	public static boolean reload()
	{
		if(!initialized)
			return false;
		try
		{
			getInstance().loadConfig();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public static ConfigManager getInstance()
	{
		return ConfigManager.instance;
	}
	
	public float getPower()
	{
		return Float.parseFloat(this.config.getString("general_settings.power", "2.0"));
	}
	
	public boolean getOnFire()
	{
		return config.getBoolean("general_settings.on_fire", true);
	}
	
	public void setPower(float p)
	{
		config.set("general_settings.power", p);
	}
	
	public void setOnFire(boolean b)
	{
		config.set("general_settings.on_fire", b);
	}
}



































