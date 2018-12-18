package com.rzheng.eggsplosion;

import org.bukkit.plugin.java.JavaPlugin;

import com.rzheng.eggsplosion.managers.ConfigManager;

public class EggsplosionMain extends JavaPlugin
{
	@Override
	public void onEnable() 
	{
		ConfigManager.initialize(this);
		this.getServer().getPluginManager().registerEvents(new EggListener(), this);
		
		
		this.getCommand("ep").setExecutor(new EggCommand());

	}
	

}
