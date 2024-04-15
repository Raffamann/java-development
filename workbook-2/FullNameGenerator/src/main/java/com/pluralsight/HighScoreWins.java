package com.pluralsight;

import java.util.Scanner;
public class HighScoreWins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game score: (Home:Visitor|(score):(score)");
        String gameScore = scanner.nextLine();
        String [] scores = gameScore.split("[:|]");

        String homeTeam = scores[0];
        String visitorTeam = scores[1];

        int homeScore = Integar.parseInt(scores[2]);
        int visitorScore = Integar.parseInt(scores[3]);

        if (homeScore > visitorScore) {
            System.out.print("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.print("Winner: " + visitorTeam);
        } else {
            System.out.print("Tie!");
        }



    }
}
