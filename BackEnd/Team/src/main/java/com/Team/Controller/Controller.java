package com.Team.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Team.Entity.Team;
import com.Team.Model.Player;
import com.Team.Service.TeamService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/restTeam")
public class Controller {
	
	@Autowired
	private TeamService service;
	
	@PostMapping("/saveTeam")
	public ResponseEntity<?> saveTeam(@RequestBody Team teamdata){
		
		return service.checkValidTeam(teamdata);
	}
	
	@GetMapping("findPlayerByTeamName/{teamName}")
	public Player[] findPlayerByTeamName(@PathVariable("teamName") String teamName) {
		
		return service.findPlayerByTeamName(teamName);
		
	}
	
	@GetMapping("/findTeamDetails/{teamName}")
	public Team findTeamDetails(@PathVariable("teamName") String teamName) {
		return service.findTeamDetails(teamName);
	}
	
	

}
