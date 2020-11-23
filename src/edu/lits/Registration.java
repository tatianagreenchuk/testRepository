package edu.lits;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String menuOption = "0";
        while ("0".equals(menuOption)) {
            System.out.println();
            System.out.println("<registration menu>");
            System.out.println("1: go back");
            System.out.println("2: start registration");
            System.out.print("choose option: ");
            Scanner textInput = new Scanner(System.in);
            menuOption = textInput.nextLine();
            switch (menuOption) {
                case "1":
                    break;
                case "2":
                    System.out.println();
                    System.out.println("<please enter your data>");
                    System.out.print("Login: ");
                    String login = textInput.nextLine();
                    System.out.print("Password: ");
                    String password = textInput.nextLine();
                    System.out.print("repeat Password: ");
                    String passwordRepeat = textInput.nextLine();

                    String completeReg = "0";
                    while ("0".equals(completeReg)) {
                        System.out.println();
                        System.out.println("<complete registration>");
                        System.out.println("1: complete registration and create account");
                        System.out.println("2: cancel registration");
                        System.out.print("choose option: ");
                        completeReg = textInput.nextLine();
                        switch (completeReg) {
                            case "1":
                                System.out.println();
                                System.out.println("Congratulations! Registration was successful");
                                break;
                            case "2":
                                System.out.println();
                                System.out.println("registration has been canceled");
                                menuOption = "0";
                                break;
                            default:
                                System.out.println();
                                System.out.println("unknown option please try again");
                                completeReg = "0";
                        }
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("unknown option please try again");
                    menuOption = "0";
            }
        }
    }
}
