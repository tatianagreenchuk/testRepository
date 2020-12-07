package edu.lits;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        startLogin();
    }

    public static void startLogin() {
        String menu = "";
        while (!"2".equals(menu)) {
            System.out.println();
            System.out.println("1 - Увійти в свій обліковий запис");
            System.out.println("2 - Повернутися до меню Авторизації");
            System.out.print("виберіть опцію: ");
            Scanner scan = new Scanner(System.in);
            menu = scan.nextLine();
            if ("1".equals(menu)) {
                System.out.println();
                System.out.println("Введіть свій логін: ");
                String login = scan.nextLine();
                System.out.println("Введіть свій пароль: ");
                String password = scan.nextLine();
                String[] pass = new String[]{"aaaaa", "sssss", "ddddd", "fffff", "ttttt"};
                switch (password) {
                    case "aaaaa":
                    case "sssss":
                    case "ddddd":
                    case "fffff":
                    case "ttttt":
                        System.out.println();
                        System.out.println("Вітаємо, ви увійшли в свій аккаунт!");
                        Navigation navigating = new Navigation();
                        navigating.startNavigation();
                        menu = "2";
                        break;
                    default:
                        System.out.println("Виникла помилка, спробуйте ще раз");
                }
            }
        }
    }
}




