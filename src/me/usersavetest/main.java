package me.usersavetest;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.usersavetest.files.PlayerData;

public class main {
	
	
	public class Main extends JavaPlugin implements Listener {
	
		private PlayerData playerData;

		public void onEnable() {
	    	if (!getDataFolder().exists()) {
	    		getDataFolder().mkdir();
	    	}
	    	this.playerData = new PlayerData(this);
	        getServer().getPluginManager().registerEvents(this, this);
	    }
		
		public void onDisable() {
			playerData.save();
		}
	    
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		PlayerData.newPlayer(e.getPlayer(),e.getPlayer().getUniqueId(),e.getPlayer().getAddress());
	}
	
	public String getDataFolder() {
		return getDataFolder();
	}			

	}
	    
