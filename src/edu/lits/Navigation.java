package edu.lits;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.System.*;

public class Navigation {
    public Navigation() {
    }

    public void Navigatia() {
        navigation();
    }

    private static void navigation() {


        {
            System.out.println("Welcome! Please choose what you are looking for:\n" +
                    "1) ..Go Back..      2) ..Create Task..  " +
                    "    3) ..Test Me..    4) ..Leaderboard..");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            while (!str.equals("1")) {
                switch (str) {
                    case "2":

                        CreateTask createTask = new CreateTask();
                        new CreateTask().CreateTask();
                        break;
                    case "3":
                        out.println("test me");;
                        break;
                    case "4":
                        out.println("leaderboard");
                        break;
                    default:
                        System.out.println("Please, choose an option from 1 to 4");
                        break;
                }
                str = sc.nextLine();
            }
            out.println("go back");
        }
    }

}
