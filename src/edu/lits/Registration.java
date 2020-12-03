package edu.lits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registration {
    /*static final String HEADER1 = "<registration menu>";
    static final String CHOOSE = "choose option: ";
    static final String HEADER2 = "<please enter your data>";
    static final String LOGIN = "Login: ";
    static final String PASSWORD = "Password: ";
    static final String REPEATE = "repeat Password: ";
    static final String HEADER3 = "<complete registration>";
    static final String CONGRAT = "Congratulations! Registration was successful";
    static final String CANCELED = "registration has been canceled";*/

    static final String HEADER1 = "<меню реєстрації>";
    static final String CHOOSE = "виберіть опцію: ";
    static final String HEADER2 = "<будь-ласка введіть ваші дані>";
    static final String LOGIN = "Логін: ";
    static final String PASSWORD = "Пароль: ";
    static final String REPEATE = "повторіть Пароль: ";
    static final String HEADER3 = "<завершення реєстрації>";
    static final String CONGRAT = "Вітаємо! Реєстрація пройшла успішно";
    static final String CANCELED = "реєстрація була відмінена";

    static boolean stayInMenu;

    public static void runRegistration() {

        stayInMenu = true;

        while (stayInMenu) {

            System.out.println();
            System.out.println(HEADER1);
            System.out.println(RegMenu.BACK.menuNumber + " - " + RegMenu.BACK.menuName);
            System.out.println(RegMenu.CREATE.menuNumber + " - " + RegMenu.CREATE.menuName);
            System.out.print(CHOOSE);

            Scanner textInput = new Scanner(System.in);
            String menuOption = textInput.nextLine();

            RegMenu menu = RegMenu.BACK;
            for (RegMenu i: RegMenu.values()) {
                if (menuOption.equals(i.menuNumber)) {
                    menu = i;
                }
            }

            switch (menu) {
                case BACK:
                    Main.open();
                    break;
                case CREATE:
                    createAccount();
            }
        }
    }

    public static Map<String,String> accountData=new HashMap<>();
    public static void createAccount() {

        System.out.println();
        System.out.println(HEADER2);

        Scanner textInput = new Scanner(System.in);

        System.out.print(LOGIN);
        String login = textInput.nextLine();
        System.out.print(PASSWORD);
        String password = textInput.nextLine();
        System.out.print(REPEATE);
        String passwordRepeat = textInput.nextLine();

        boolean stayInSubMenu = true;
        while (stayInSubMenu) {
            System.out.println();
            System.out.println(HEADER3);
            System.out.println(RegMenu.COMPLETE.menuNumber + " - " + RegMenu.COMPLETE.menuName);
            System.out.println(RegMenu.CANCEL.menuNumber + " - " + RegMenu.CANCEL.menuName);
            System.out.print(CHOOSE);

            String menuOption = textInput.nextLine();

            RegMenu menu = RegMenu.CANCEL;
            for (RegMenu i: RegMenu.values()) {
                if (menuOption.equals(i.menuNumber)) {
                    menu = i;
                }
            }

            switch (menu) {
                case COMPLETE:
                    accountData.put(login,password);
                    System.out.println();
                    System.out.println(CONGRAT);
                    Navigating.navigating();
                    break;
                case CANCEL:
                    System.out.println();
                    System.out.println(CANCELED);
                    stayInSubMenu = false;
            }
        }
    }
}
