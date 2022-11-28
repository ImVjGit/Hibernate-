package com.daySeven.Maven.OntToMany;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Players {
	@Id
	int PlayerId;
	String Playername;
	@ManyToOne(targetEntity = Team.class)
	Team team;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Players(int playerId, String playername, Team team) {
		super();
		PlayerId = playerId;
		Playername = playername;
		this.team = team;
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
