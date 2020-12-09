package edu.lits;

import edu.lits.UserArrayFile.ArrayFileUser;

import java.io.IOException;
import java.util.Scanner;

public class Registration {
    static final String CHOOSE = "виберіть опцію: ";
    static final String LOGIN = "Ваш новий логін: ";
    static final String PASSWORD = "Ваш новий пароль: ";
    static final String REPEAT = "повторіть Ваш Пароль: ";

    static boolean stayInMenu;

    public static void createAccount() throws IOException {

        stayInMenu = true;

        while (stayInMenu) {

            System.out.println();
            System.out.println(RegMenu.CREATE.menuNumber + " - " + RegMenu.CREATE.menuName);
            System.out.println(RegMenu.BACK.menuNumber + " - " + RegMenu.BACK.menuName);
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
                    stayInMenu = false;
                    break;
                 case CREATE:

                     System.out.println();
                    System.out.print(LOGIN);
                    String login = textInput.nextLine();

                    ArrayFileUser arrayFileUser=new ArrayFileUser();
                    arrayFileUser.userUser();
                    for (String s :arrayFileUser.arrayUserName) {
                        if (login.equals(s)) {
                            System.out.println("такий логін вже існує ");
                            System.out.println("спробуйте увійти в свій обліковій запис");
                            Login beg = new Login();
                            beg.startLogin();
                        } }

                            System.out.print(PASSWORD);
                            String password = textInput.nextLine();
                            System.out.print(REPEAT);
                            String passwordRepeat = textInput.nextLine();

            }
        }
    }
}
