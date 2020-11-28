package edu.lits;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        open();
    }

       public static void open() {
        Login loG=new Login();
        String menu = "0";
        while (menu.equals("0")) {
            System.out.println();
            System.out.println("1.Новачок");
            System.out.println("2.Вже є свій аккаунт");
            System.out.println("3.Завершити");
            Scanner scan = new Scanner(System.in);
            String account = scan.nextLine();
            if (account.equals("1")) {
                Registration.runRegistration();
                break;
            }
            if (account.equals("2")) {
               loG.login();
            }else {
                System.exit(0);
            }
        }
    }
}
