package com.Player.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Player.Entity.Player;
import com.Player.Model.ResponseTemplate;
import com.Player.Service.PlayerService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/restPlayer")
public class Controller {
	
	@Autowired
	private PlayerService service;
	
	@PostMapping("/savePlayer")
	public ResponseEntity<?> savePlayer(@RequestBody Player player){
		
		return service.savePlayer(player);
	}
	

	@GetMapping("/findPlayerByTeamName/{teamName}")
	public List<Player> findPlayerByTeamName(@PathVariable("teamName") String teamName)
	{
		return service.findPlayerByTeamName(teamName);
		
	}	
	
	@GetMapping("/findByPlayerId/{playerId}")
	public ResponseEntity<?> findByPlayerId(@PathVariable("playerId") int playerId){
		
		return service.findByPlayerId(playerId);
	}
	
}

	

