package com.Team.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Team.Entity.Team;
import com.Team.Model.Player;
import com.Team.Repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
		
	//Create team,team already exist
	public ResponseEntity<?> checkValidTeam(Team teamData){
		
		if(repository.findByTeamName(teamData.getTeamName()) !=null) {
			
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
		
		repository.save(teamData);
		return ResponseEntity.ok(teamData);
	}
	
	//find player details by team name.
	public Player[] findPlayerByTeamName(String teamName) {
		
		ResponseEntity<Player[]> response=
				restTemplate.getForEntity("http://PLAYER-SERVICE/restPlayer/findPlayerByTeamName/" +teamName,Player[].class);
		
		Player[] p=response.getBody();
		return p;
	}
	
	//find team details by giving team name
	public Team findTeamDetails(String teamName)
	{
		return repository.findByTeamName(teamName);
	}

}
	
