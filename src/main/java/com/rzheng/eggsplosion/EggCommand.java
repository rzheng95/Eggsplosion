package com.rzheng.eggsplosion;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EggCommand implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(label.equalsIgnoreCase("ep"))
		{
			if(sender instanceof Player)
			{
				sender.sendMessage("Power - 5");
			}
		}
		
		return true;
	}

}
