package com.rzheng.eggsplosion;

import org.bukkit.plugin.java.JavaPlugin;

public class EggsplosionMain extends JavaPlugin
{
	@Override
	public void onEnable() 
	{
		this.getServer().getPluginManager().registerEvents(new EggListener(), this);
		
		
		this.getCommand("EP").setExecutor(new EggCommand());

	}
	

}
