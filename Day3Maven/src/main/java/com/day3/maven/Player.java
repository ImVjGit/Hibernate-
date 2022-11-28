package com.day3.maven;

public class Player {

	private int Playerid;
	private String Playername;
	
	Player(int id,String name ) {
		this.Playerid=id;
		this.Playername=name;
	}
	public int getPlayerId() {
		return Playerid;
	}
	public String getPlayerName() {
		return Playername;
	}
	public void setPlayerId(int id) {
		this.Playerid = id;
	}
	public void setPlayerName(String name) {
		this.Playername = name;
	}
	
}
