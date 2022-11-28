package com.collection.DaySeven.Set;

public class Players {

	int PlayerId;
	String Playername;

	public Players(int id, String name) {
		super();
		this.PlayerId = id;
		this.Playername = name;
	}

	public int getPlayerId() {
		return PlayerId;
	}

	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}

	public String getPlayername() {
		return Playername;
	}

	public void setPlayername(String playername) {
		Playername = playername;
	}

	public Players() {
		super();
		// TODO Auto-generated constructor stub
	}


}
