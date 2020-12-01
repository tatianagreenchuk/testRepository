package edu.lits;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.System.*;

public class Navigation {


    public static void main(String[] args) {

        navigation();
    }


    static void navigation() {


        {
            System.out.println("Welcome! Please choose what you are looking for:\n" +
                     "1) ..Go Back..      2) ..Create Task..  " +
                    "    3) ..Test Me..    4) ..Leaderboard..");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            while (!str.equals("1")) {
                switch (str) {
                    case "2":
                        CreateTask crt = new CreateTask();
                        crt.сreateTask();

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
                str = sc.nextLine();
            }
            Main bacK = new Main();
            bacK.open();
        }
    }

}
