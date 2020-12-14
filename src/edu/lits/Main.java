package edu.lits;

import java.util.Scanner;

import static edu.lits.Navigation.startNavigation;
import static edu.lits.model.WriterFileUser.writerFile;
import static edu.lits.model.WriterFileUser.writerFileUser;

public class Main {
     public static final String FILE_USERS = "User.txt";

    public static void main(String[] args)  {
        start();
    }

       public static void start()  {
        String menu = "";
        while (!"3".equals(menu)) {
            System.out.println();
            System.out.println("< Авторизація >\n" +
                    "1 - Створити новий обліковий запис\n" +
                    "2 - Увійти\n" +
                    "3 - Завершити роботу\n" +
                    "Оберіть опцію: ");
            Scanner scan = new Scanner(System.in);
            String account = scan.nextLine();
            if ("1".equals(account) || "1".equals(account))
                if ("1".equals(account)) {
                    writerFile.add("Registration.createAccount();");
                    Registration.createAccount();
                    startNavigation();
                }
            if ("2".equals(account)) {
                writerFile.add("Login.startLogin();");
                Login.startLogin();
                startNavigation();
            }
            if ("3".equals(account)) {
                writerFile.add("menu");
                menu = "3";
            }
        }
               writerFileUser();
                writerFile.add("System.exit(0)");
                System.exit(0);
    }
}
