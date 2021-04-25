package com.respam.algoexpert.solutions;

import java.util.*;

public class TournamentWinner {

    /**
     *
     * @param competitions - ArrayList of competitions having ArrayList of Teams
     * @param results - ArrayList denoting who won each competition
     * @return winnerTeam - Competition Winner
     */
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        List<String> winners = new ArrayList<>();

        String winnerTeam = "";
        int highestFrequency =0;


        for(int i=0; i<results.size(); i++) {
            if (results.get(i) == 0) {
                winners.add(competitions.get(i).get(1));
            } else {
                winners.add(competitions.get(i).get(0));
            }
        }

        for(String team : winners) {
            if(Collections.frequency(winners, team) > highestFrequency) {
                winnerTeam = team;
                highestFrequency = Collections.frequency(winners, team);
            }
        }

        return winnerTeam;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("HTML");
        c1.add("C#");
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("C#");
        c2.add("Python");
        ArrayList<String> c3 = new ArrayList<>();
        c3.add("Python");
        c3.add("HTML");

        competitions.add(c1);
        competitions.add(c2);
        competitions.add(c3);

        result.add(0);
        result.add(0);
        result.add(1);

        TournamentWinner tw = new TournamentWinner();
        String winner = tw.tournamentWinner(competitions, result);
        System.out.println(winner);
    }

}
