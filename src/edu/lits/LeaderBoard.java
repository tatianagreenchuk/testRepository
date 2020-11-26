package edu.lits;

import java.util.Scanner;

public class LeaderBoard {
    public static void main(String[] args) {
        leaderboard();
    }

    public void LeaderBoard() {
        leaderboard();
    }

    private static void leaderboard() {

        System.out.println("Welcome to the leaderboard!\n" +
                "Please, choose an option 1 or 2\n" +
                "1) ..Go Back..      2) ..View Leaderboard.. ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        switch (str) {
            case "1":
                Navigation nav = new Navigation();
                nav.navigation();
                break;
            case "2":
                System.out.println("leaderboard");
                break;
            default:
                System.out.println("Please, choose an option from 1 to 4");
        }
    }
}
