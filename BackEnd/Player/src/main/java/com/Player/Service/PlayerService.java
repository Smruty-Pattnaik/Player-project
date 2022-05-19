package com.Player.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Player.Entity.Player;
import com.Player.Model.ResponseTemplate;
import com.Player.Model.Team;
import com.Player.Repository.PlayerRepository;


@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repository;
	
	@Autowired
	private RestTemplate template;
	
	
	
	//show all the player details by team name
 	public List<Player> findPlayerByTeamName(String teamName){
 		
 		return repository.findByTeamName(teamName);
 	}
 
 	
 	//player details by playerId
 	public ResponseEntity<?> findByPlayerId(int playerId){
 		
 		if(repository.findByPlayerId(playerId)==null) {
 			
 			return (ResponseEntity<?>) ResponseEntity.internalServerError(); 	
 			}
 	
 	
 	return ResponseEntity.ok(repository.findByPlayerId(playerId));
}
 	
 	//create player
 	public ResponseEntity<?> savePlayer(Player player){
 		
 		Team teamResponse= template.getForObject("http://TEAM-SERVICE/restTeam/findTeamDetails/"+ player.getTeamName(),Team.class);
 		
 		int sum=0;
 		List<Player> p=repository.findByTeamName(teamResponse.getTeamName());
 		for(Player p1:p)
 		{
 			sum=sum+p1.getPlayerBudget();
 			
 		}
 		if(sum<=teamResponse.getTeamBudget())
 		{
 			sum=sum+player.getPlayerBudget();
 			
 		}
 		if(sum<=teamResponse.getTeamBudget())
 		{
 			
 			repository.save(player);
 			return ResponseEntity.ok(player);
 		}
 		else {
 			
 			player.setTeamName("NA");
 			repository.save(player);
 			return (ResponseEntity<?>)ResponseEntity.internalServerError();
 		}
 	}


 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
}
