package com.Team.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Team {
	
	@Id
	@GeneratedValue
	private int teamId;
	private int teamBudget;
	private String teamName;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int teamId, int teamBudget, String teamName) {
		super();
		this.teamId = teamId;
		this.teamBudget = teamBudget;
		this.teamName = teamName;
	}
	public int getTeamId() {
		return teamId;
	}
	public int getTeamBudget() {
		return teamBudget;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public void setTeamBudget(int teamBudget) {
		this.teamBudget = teamBudget;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	

}
