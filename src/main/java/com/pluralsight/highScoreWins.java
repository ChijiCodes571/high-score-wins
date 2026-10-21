package com.pluralsight;

import java.util.Scanner;

public class highScoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Prompt the user for the game score

        System.out.println("Enter the game score: ");
        String input = myScanner.nextLine();

        //Separate the teams from score
        String[] parts = input.split("\\|");
        String teamsPart = parts[0];
        String scoresPart = parts[1];

        //Separate teams name
        String[] teams = teamsPart.split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        //Separate and convert the score
        String[] scores = scoresPart.split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // Step 4: Compare scores and determine the winner
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Winner: Tie!");
        }
    }
}
