package edu.lits;

import java.util.Scanner;

public class LeaderBoard {

    static void leaderBoard() {
        LeadMen menu = null;
        while (menu != LeadMen.BACK) {
            System.out.println();
            System.out.println("1 - Показати дошку лідерів");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("виберіть опцію: ");
            Scanner sc = new Scanner(System.in);
            String menuOption = sc.nextLine();

            for (LeadMen i : LeadMen.values()) {
                if (menuOption.equals(i.menuNumber)) {
                    menu = i;
                }
            }
            switch (menu) {
                case START:
                    System.out.println();
                    System.out.println("виводимо дошку лідерів ...");
                    break;
                case BACK:
                    break;
                default:
                    System.out.println("Please, choose an option from 1 to 2");
            }
        }
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