package edu.lits;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.System.*;

public class Navigation {
    public static void main(String[] args) {
        out.println("Welcome! Please choose what you are looking for:\n" +
                "1) ..Go Back..      2) ..Create Task..  " +
                "    3) ..Test Me..    4) ..Leaderboard..");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (!str.equals("1")) {
            if (str.equals("2")) {
                System.out.println("Welcome to 'Create Task' menu.");
                str = sc.nextLine();
            } else if (str.equals("3")) {
                System.out.println("You chose 'Test Me'");
                str = sc.nextLine();
            } else if (str.equals("4")) {
                System.out.println("Welcome to the Leaderboard");
                str = sc.nextLine();
            } else {
                System.out.println("Please, choose an option from 1 to 4");
                str = sc.nextLine();
            }
        }
        out.println(" You are back to the Identification ");
    }
}

