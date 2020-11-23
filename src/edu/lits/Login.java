package edu.lits;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String menu = "0";
        while (menu.equals("0")) {
            System.out.println("1.Новачок");
            System.out.println("2.Вже є свій аккаунт");
            Scanner scan = new Scanner(System.in);
            String account = scan.nextLine();
            if (account.equals("1")) {
                System.out.println("Зареєструватися");
                break;
            }
            if (account.equals("2")) {
                System.out.println("1. Увійти в свій аккаунт ");
                System.out.println("2. Повернутися в попереднє меню ");
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

                if (name.equals("2")) {
                }
            }
            {
            }
        }
    }
}


