package me.usersavetest.files;

import java.net.InetSocketAddress;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.usersavetest.main;
import me.usersavetest.main.Main;

public class PlayerData extends AbstractFile{

	public PlayerData(Main main) {
		super(main , "users.yml");
	}
	
	public static void newPlayer(Player player, UUID uuid, InetSocketAddress inetSocketAddress) {
		if (!config.contains(player.getPlayer().toString() + player.getUniqueId().toString() + player.getAddress().toString())) {
			config.createSection(player.getPlayer().toString() + player.getUniqueId().toString() + player.getAddress().toString());
		}
		config.set(player.getPlayer().toString() + player.getUniqueId().toString() , player.getAddress().toString());
	}

}
