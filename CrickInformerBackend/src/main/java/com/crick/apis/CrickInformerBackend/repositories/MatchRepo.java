package com.crick.apis.CrickInformerBackend.repositories;

import com.crick.apis.CrickInformerBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {

    //match fetch karengay
    //team name ke dwara

    Optional<Match> findByTeamHeading(String teamHeading);

}
