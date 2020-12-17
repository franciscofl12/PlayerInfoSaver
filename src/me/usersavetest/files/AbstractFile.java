package me.usersavetest.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

import me.usersavetest.main;
import me.usersavetest.main.Main;

import org.bukkit.configuration.file.FileConfiguration;

public class AbstractFile {
	
	private Main main;
	private File file;
	public static FileConfiguration config;
	
	
	public AbstractFile(Main main, String fileName) {
		super();
		this.main = main;
		this.file = new File(main.getDataFolder(),fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		config = YamlConfiguration.loadConfiguration(file);
	}
	
	public void save() {
		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
