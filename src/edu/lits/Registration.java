package edu.lits;

import java.util.Scanner;

public class Registration {

    static boolean stayInMenu;

    public static void main(String[] args) {
        registration();
    }

    public static void registration() {

        stayInMenu = true;

        while (stayInMenu) {

            System.out.println();
            System.out.println(RegMenu.HEADER1.menuName);
            System.out.println(RegMenu.BACK.menuName);
            System.out.println(RegMenu.START.menuName);
            System.out.print(RegMenu.CHOOSE.menuName);

            Scanner textInput = new Scanner(System.in);

            String menuOption = textInput.nextLine();

            switch (menuOption) {
                case "1":
                    stayInMenu = false;
                    break;
                case "2":
                    creatingAccount();
                    break;
                default:
                    System.out.println();
                    System.out.println(RegMenu.UNKNOWN.menuName);
            }
        }
    }

    public static void creatingAccount() {

        System.out.println();
        System.out.println(RegMenu.PLEASE.menuName);

        Scanner textInput = new Scanner(System.in);

        System.out.print(RegMenu.LOGIN.menuName);
        String login = textInput.nextLine();
        System.out.print(RegMenu.PASSWORD.menuName);
        String password = textInput.nextLine();
        System.out.print(RegMenu.REPEATE.menuName);
        String passwordRepeat = textInput.nextLine();

        boolean stayInSubMenu = true;
        while (stayInSubMenu) {
            System.out.println();
            System.out.println(RegMenu.HEADER2.menuName);
            System.out.println(RegMenu.COMPLETE.menuName);
            System.out.println(RegMenu.CANCEL.menuName);
            System.out.print(RegMenu.CHOOSE.menuName);

            String menuOption = textInput.nextLine();

            switch (menuOption) {
                case "1":
                    System.out.println();
                    System.out.println(RegMenu.CONGRAT.menuName);
                    stayInMenu = false;
                    stayInSubMenu = false;
                    Navigation.navigation();
                    break;
                case "2":
                    System.out.println();
                    System.out.println(RegMenu.CANCELED.menuName);
                    stayInMenu = true;
                    stayInSubMenu = false;
                    break;
                default:
                    System.out.println();
                    System.out.println(RegMenu.UNKNOWN.menuName);
            }
        }
    }
}
