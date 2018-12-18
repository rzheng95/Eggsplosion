package com.rzheng.eggsplosion;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.rzheng.eggsplosion.managers.ConfigManager;

public class EggCommand implements CommandExecutor
{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(args.length > 1)
		{
			if(args[0].equalsIgnoreCase("setpower"))
			{
				try 
				{
					float power = Float.parseFloat(args[1]);
					cmdSetPower(power);
					sender.sendMessage(ChatColor.BLUE+"Power has been set to "+power);
				}
				catch(NumberFormatException e)
				{
					e.printStackTrace();
					sender.sendMessage(ChatColor.RED+"Power must be a decimal.");
				}	
			}
			else if(args[0].equalsIgnoreCase("setonfire"))
			{
				try 
				{
					boolean onfire = Boolean.parseBoolean(args[1]);
					cmdSetOnFire(onfire);
					sender.sendMessage(ChatColor.BLUE+"On fire has been set to "+onfire);
				}
				catch(NumberFormatException e)
				{
					e.printStackTrace();
					sender.sendMessage(ChatColor.RED+"On fire must be a boolean value.");
				}
			}
		}
		else
		{
			sender.sendMessage(ChatColor.AQUA+" | Eggsplosion | "+ChatColor.GRAY+"Command List - <Required> <Required>");
			sender.sendMessage(ChatColor.GRAY+"/ep setPower <decimal value> "+ChatColor.AQUA+"- Set the explosion power.");
			sender.sendMessage(ChatColor.GRAY+"/ep setOnFire <boolean value> "+ChatColor.AQUA+"- Set the explosion with or without fire.");
		}

		
		return true;
	}
	
	private void cmdSetPower(float p)
	{
		ConfigManager.getInstance().setPower(p);
	}
	
	private void cmdSetOnFire(boolean b)
	{
		ConfigManager.getInstance().setOnFire(b);
	}
	
}
