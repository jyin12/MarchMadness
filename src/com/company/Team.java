package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Created by jy412 on 3/6/17.
 */
public class Team {
    String TeamName;
    int DayNum;
    int Score;
    int fgm;
    int fga;
    int fgm3;
    int fga3;
    int ftm;
    int or;
    int dr;
    int ast;
    int to;
    int stl;
    int blk;
    int pf;
    public Team(String name, int season, int score, int fieldGoalsMade, int fieldGoalsAttempted, int threePointermade, int threePointersAttempted, int freeThrowMade, int offRebound,
                int defRebound, int assist, int turnovers, int steals, int blocks, int personalFouls)
    {
        TeamName = name;
        DayNum =season;
        Score = score;
        fgm = fieldGoalsMade;
        fga = fieldGoalsAttempted;
        fgm3 = threePointermade;
        fga3 = threePointersAttempted;
        ftm = freeThrowMade;
        or = offRebound;
        dr = defRebound;
        ast = assist;
        to = turnovers;
        stl = steals;
        blk = blocks;
        pf = personalFouls;
    }
    public int TeamGame()
    {
        int avgSeason = ((Score + fgm + fga + fgm3 + fga3 + ftm + or + dr + ast) - (to + stl + blk + pf)) / DayNum;
        return avgSeason;
    }
}
