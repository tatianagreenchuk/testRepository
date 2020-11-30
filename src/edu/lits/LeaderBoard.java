package edu.lits;

import javax.naming.ldap.StartTlsRequest;
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
        String menuOption = sc.nextLine();
        LeadMen1 menu = LeadMen1.BACK;
        for (LeadMen1 i : LeadMen1.values()) {
            if (menuOption.equals(i.menuNumber)) {
                menu = i;
            }
        }
        switch (menu) {
            case START:
                System.out.println("LeaderBoard");
                break;

        }
        menuOption = sc.nextLine();
        Navigating.navigating();
    }
}



//                switch (str) {
//                    case "1":
//                        Navigating nav = new Navigating();
//                        nav.navigating();
//                        break;
//                    case "2":
//                        System.out.println();
//
//                        break;
//                    default:
//                        System.out.println("Please, choose an option from 1 to 4");
//                }


//                menuOption = sc.nextLine();
//                if (menuOption.equals("1")){
//                    LeaderBoard.leaderboard();
//                }else{
//
//                }