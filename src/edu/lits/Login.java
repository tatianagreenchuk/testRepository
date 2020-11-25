package edu.lits;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        login();

    }

    public static void login() {
            System.out.println("1. Увійти в свій аккаунт ");
            System.out.println("2. Повернутися в попереднє меню ");
            Scanner scan=new Scanner(System.in);

            String name = scan.nextLine();
            if (name.equals("1")) {
                System.out.print("Введіть свій логін: ");
                String login = scan.next();
                System.out.print("Введіть свій пароль: ");
                String password = scan.next();
                String[] pass = new String[]{"aaaaa", "sssss", "ddddd", "fffff", "ttttt"};
                switch (password) {
                    case "aaaaa":
                    case "sssss":
                    case "ddddd":
                    case "fffff":
                    case "ttttt":
                        System.out.println("Вітаємо, ви увійшли в свій аккаунт!");
                        break;
                    default:
                        System.out.println("Виникла помилка, спробуйте ще раз");
                }}
        Main bacK=new Main();
            if (name.equals("2")) {
                bacK.open();
            }
        }
    }




