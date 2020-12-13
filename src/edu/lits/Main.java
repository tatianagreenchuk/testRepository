package edu.lits;

import java.io.IOException;
import java.util.Scanner;

import static edu.lits.model.WriterFileUser.writerFile;
import static edu.lits.model.WriterFileUser.writerFileUser;

public class Main {
     public static final String FILE_USERS = "User.txt";

    public static void main(String[] args) throws IOException {
        start();
    }

       public static void start() throws IOException {
        String menu = "";
        while (!"3".equals(menu)) {
            System.out.println();
            System.out.println("< Авторизація >\n" +
                    "1 - Створити новий обліковий запис\n"+
                    "2 - Увійти\n" +
                    "3 - Завершити роботу\n" +
                    "Оберіть опцію: ");
            Scanner scan = new Scanner(System.in);
            String account = scan.nextLine();
            if ("1".equals(account)) {
                writerFile.add("Registration.createAccount();");
                Registration.createAccount();
            }
            if ("2".equals(account)) {
                writerFile.add("Login.startLogin();");
                Login.startLogin();
            }
            if ("3".equals(account)) {
                writerFile.add("menu");
                menu = "3";
            }
                writerFile.add("System.exit(0)");
        }       writerFileUser();
                System.exit(0);
    }
}
