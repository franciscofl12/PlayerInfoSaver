package me.usersavetest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;
import java.util.logging.FileHandler;

public class Player {
	
	private String nick;
	private UUID uuid;
	private String ip;
	
	public Player(String nick, UUID uuid, String ip) {
		super();
		this.nick = nick;
		this.uuid = uuid;
		this.ip = ip;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Player [nick=" + nick + ", uuid=" + uuid + ", ip=" + ip + "]";
	}

	
}
