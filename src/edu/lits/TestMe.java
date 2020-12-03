package edu.lits;

import java.util.Scanner;

public class TestMe {


    public static void main(String[] args) {
        testMe();
    }

    static void testMe() {
        System.out.println("Welcome to the Test Me menu!\n" +
                "Please choose what you are looking for:\n" +
                "1) ..Go Back..         2) ..Take a Test..");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (!str.equals("1")) {
            switch (str) {
                case "2":
                    System.out.println("the test...");
                    break;
                default:
                    System.out.println("Please, choose an option from 1 to 4");
                    break;
            }
            str=sc.nextLine();
        }
        System.out.println("Welcome! Please choose what you are looking for:\n" +
                "1) ..Go Back..      2) ..Create Task..  " +
                "    3) ..Test Me..    4) ..Leaderboard..");
    }
}
