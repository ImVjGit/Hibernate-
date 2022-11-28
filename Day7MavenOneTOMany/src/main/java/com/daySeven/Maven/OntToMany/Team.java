package com.daySeven.Maven.OntToMany;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity

public class Team {
	@Id
	int TeamId;
	String TeamName;
	String TeamDetails;
	@OneToMany(targetEntity = Players.class,cascade = CascadeType.ALL)
	Set<Players> player;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, String teamDetails, Set<Players> player) {
		super();
		TeamId = teamId;
		TeamName = teamName;
		TeamDetails = teamDetails;
		this.player = player;
	}

	public int getTeamId() {
		return TeamId;
	}

	public void setTeamId(int teamId) {
		TeamId = teamId;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getTeamDetails() {
		return TeamDetails;
	}

	public void setTeamDetails(String teamDetails) {
		TeamDetails = teamDetails;
	}

	public Set<Players> getPlayer() {
		return player;
	}

	public void setPlayer(Set<Players> player) {
		this.player = player;
	}

}
