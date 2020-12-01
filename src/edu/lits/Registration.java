package edu.lits;

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
            System.out.println(RegMenu1.BACK.menuNumber + " - " + RegMenu1.BACK.menuName);
            System.out.println(RegMenu1.START.menuNumber + " - " + RegMenu1.START.menuName);
            System.out.print(CHOOSE);

            Scanner textInput = new Scanner(System.in);
            String menuOption = textInput.nextLine();

            RegMenu1 menu = RegMenu1.BACK;
            for (RegMenu1 i: RegMenu1.values()) {
                if (menuOption.equals(i.menuNumber)) {
                    menu = i;
                }
            }

            switch (menu) {
                case BACK:
                    Main.open();
                    break;
                case START:
                    createAccount();
            }
        }
    }

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
            System.out.println(RegMenu2.COMPLETE.menuNumber + " - " + RegMenu2.COMPLETE.menuName);
            System.out.println(RegMenu2.CANCEL.menuNumber + " - " + RegMenu2.CANCEL.menuName);
            System.out.print(CHOOSE);

            String menuOption = textInput.nextLine();

            RegMenu2 menu = RegMenu2.CANCEL;
            for (RegMenu2 i: RegMenu2.values()) {
                if (menuOption.equals(i.menuNumber)) {
                    menu = i;
                }
            }

            switch (menu) {
                case COMPLETE:
                    System.out.println();
                    System.out.println(CONGRAT);
                    Navigation.navigation();
                    break;
                case CANCEL:
                    System.out.println();
                    System.out.println(CANCELED);
                    stayInSubMenu = false;
            }
        }
    }
}
