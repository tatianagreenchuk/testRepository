package edu.lits;

import java.util.Scanner;

public class Navigating {


    public static void main(String[] args) {

        navigating();
    }


    static void navigating() {


        {
            System.out.println("Welcome! Please choose what you are looking for:\n" +
                     "1) ..Go Back..      2) ..Create Task..  " +
                    "    3) ..Test Me..    4) ..Leaderboard..");
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            while (!line.equals("1")) {
                switch (line) {
                    case "2":
                        CreateTask crt = new CreateTask();
                        crt.createTask();

                        break;
                    case "3":
                        TestMe tm = new TestMe();
                        tm.TestMe();

                        break;
                    case "4":
                        LeaderBoard lb = new LeaderBoard();
                        lb.LeaderBoard();
                        break;
                    default:
                        System.out.println("Please, choose an option from 1 to 4");
                        break;
                }
                line = scan.nextLine();
            }

        }
    }

}
