package edu.lits;

import java.io.IOException;
import java.util.Scanner;

public class Main {


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
                Registration.createAccount();
            }
            if ("2".equals(account)) {
                Login.startLogin();
            }
            if ("3".equals(account)) {
                menu = "3";
            }

                /*String name="nameUser";
                File work=new File(name+".txt");
                try {
                    PrintWriter works=new PrintWriter(new BufferedWriter(new FileWriter(work,true)));
                    works.println("сюди якось запихнемо наш масивчик :-) ");
                    works.flush();
                    works.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.exit(0);*/
        }
    }
}
