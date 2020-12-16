package me.usersavetest;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main {
	
	public class Main extends JavaPlugin implements Listener {
	
	    public void onEnable() {
	        getServer().getPluginManager().registerEvents(this, this);
	    	
	    }
	    
	}
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player p = (Player) event.getPlayer();
		
		Player user = new Player(Bukkit.getName(), Bukkit.getServer().getPlayer(((Server) p).getName()).getUniqueId(), Bukkit.getIp());
		
	}														
	    
}
