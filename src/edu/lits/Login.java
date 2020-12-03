package edu.lits;

import java.util.Map;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        login();

    }

    public static void login() {
        int i = 1;
        System.out.println("1. Увійти в свій аккаунт ");
        System.out.println("2. Повернутися в попереднє меню ");
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        if (name.equals("1")) {
            while (i != 0) {
                System.out.println("Введіть свій логін: ");
                String login = scan.nextLine();
                System.out.println("Введіть свій пароль: ");
                String password = scan.nextLine();
                // String[] pass = new String[]{"aaaaa", "sssss", "ddddd", "fffff", "ttttt"};
                for (Map.Entry<String, String> ad : Registration.accountData.entrySet()) {
                    if (ad.getKey().equals(login) && ad.getValue().equals(password)) {

//                    switch (password) {
//                        case "aaaaa":
//                        case "sssss":
//                        case "ddddd":
//                        case "fffff":
//                        case "ttttt":
                        System.out.println("Вітаємо, ви увійшли в свій аккаунт!");
                        System.out.println();
                        Navigating.navigating();
                    }else{
                            System.out.println("Виникла помилка, спробуйте ще раз");
                    }
                }
            }
            Main bacK = new Main();
            bacK.open();

        }
    }
}




