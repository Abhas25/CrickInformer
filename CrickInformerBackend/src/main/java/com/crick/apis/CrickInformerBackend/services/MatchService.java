package com.crick.apis.CrickInformerBackend.services;

import com.crick.apis.CrickInformerBackend.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {


    //get all matches

    List<Match> getAllMatches();



    //get live matches

    List<Match> getLiveMatches();
    //get points table

    List<List<String>> getPointsTable();



}
