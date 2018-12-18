package com.rzheng.eggsplosion;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import com.rzheng.eggsplosion.managers.ConfigManager;

public class EggListener implements Listener
{

	@EventHandler
	public void onProjectileHitEvent(ProjectileHitEvent e)
	{
		if(e.getEntity().getType() == EntityType.EGG)
		{
			if(e.getHitBlock() != null)
				e.getHitBlock().getWorld().createExplosion(e.getHitBlock().getLocation(), ConfigManager.getInstance().getPower(), ConfigManager.getInstance().getOnFire());
			else
				e.getHitEntity().getWorld().createExplosion(e.getHitEntity().getLocation(), ConfigManager.getInstance().getPower(), ConfigManager.getInstance().getOnFire());

		}
	}
	

	
}
