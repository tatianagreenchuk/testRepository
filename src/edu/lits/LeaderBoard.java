package edu.lits;

import edu.lits.model.ArrayFileUser;
import java.util.Scanner;

public class LeaderBoard {

    static void showLeaderBoard() {
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
                    System.out.println("Наші лідери:\n");
                    ArrayFileUser arFil = new ArrayFileUser();
                    arFil.arraySort();
                    for (String s : arFil.loginString){
                        System.out.println(s);
                    }
                    break;
                case BACK:
                    break;
                default:
                    System.out.println("Please, choose an option from 1 to 2");
            }

       break; }

    }

}

