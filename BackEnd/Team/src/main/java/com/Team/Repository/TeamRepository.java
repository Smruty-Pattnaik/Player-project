package com.Team.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Team.Entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
	
  Team findByTeamName(String teamName);
  
  

}
