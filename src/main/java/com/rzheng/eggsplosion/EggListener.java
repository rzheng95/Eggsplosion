package com.rzheng.eggsplosion;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class EggListener implements Listener
{

	@EventHandler
	public void onProjectileHitEvent(ProjectileHitEvent e)
	{
		EggSettings setting = new EggSettings();
		if(e.getEntity().getType() == EntityType.EGG)
		{
			if(e.getHitBlock() != null)
				e.getHitBlock().getWorld().createExplosion(e.getHitBlock().getLocation(), setting.getPower(), setting.getOnFire());
			else
				e.getHitEntity().getWorld().createExplosion(e.getHitEntity().getLocation(), setting.getPower(), setting.getOnFire());

		}
	}
	

	
}
