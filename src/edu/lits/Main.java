package edu.lits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
                Registration.createAccount();
                break;
            }
            if (account.equals("2")) {
               loG.login();
            }else {
                String name="nameUser";
                File work=new File(name+".txt");
                try {
                    PrintWriter works=new PrintWriter(new BufferedWriter(new FileWriter(work,true)));
                    works.println("сюди якось запихнемо наш масивчик :-) ");
                    works.flush();
                    works.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }
        }
    }
}
