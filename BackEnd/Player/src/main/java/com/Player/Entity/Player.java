package com.Player.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player {
	
	@Id
	@GeneratedValue
	private int playerId;
	private String playerName;
	private int playerBudget;
	private String teamName;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName, int playerBudget, String teamName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerBudget = playerBudget;
		this.teamName = teamName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerBudget() {
		return playerBudget;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setPlayerBudget(int playerBudget) {
		this.playerBudget = playerBudget;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
	

}
