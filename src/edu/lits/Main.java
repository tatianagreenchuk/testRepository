package edu.lits;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        start();
    }

       public static void start() {
        String menu = "";
        while (!"3".equals(menu)) {
            System.out.println();
            System.out.println("< Авторизація >");
            System.out.println("1 - Створити новий обліковий запис");
            System.out.println("2 - Увійти");
            System.out.println("3 - Завершити роботу");
            System.out.print("виберіть опцію: ");
            Scanner scan = new Scanner(System.in);
            String account = scan.nextLine();
            if ("1".equals(account)) {
                Registration registration = new Registration();
                registration.createAccount();
            }
            if ("2".equals(account)) {
                Login loG = new Login();
                loG.startLogin();
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
