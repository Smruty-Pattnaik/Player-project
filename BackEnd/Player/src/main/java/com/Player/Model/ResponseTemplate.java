package com.Player.Model;

import com.Player.Entity.Player;

public class ResponseTemplate {
	
	private Team team;
	private Player player;
	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplate(Team team, Player player) {
		super();
		this.team = team;
		this.player = player;
	}
	public Team getTeam() {
		return team;
	}
	public Player getPlayer() {
		return player;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}

}
