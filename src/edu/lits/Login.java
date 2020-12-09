package edu.lits;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {
        startLogin();
    }

    public static void startLogin() throws IOException {
        ArrayList<String> list = new ArrayList<>();
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


                BufferedReader reader = new BufferedReader(new FileReader("User.txt"));
                String fileString = reader.readLine();

                while (fileString != null) {
                    list.add(fileString);
                    fileString = reader.readLine();
                }


                for (int i = 0; i < list.size(); i++) {
                    int firstDot = list.get(i).indexOf(".");
                    int secondDot = list.get(i).indexOf(".", firstDot + 1);
                    String possibleUsername = list.get(i).substring(firstDot + 1, secondDot);


                    int thirdDot = list.get(i).indexOf(".", secondDot + 1);
                    String possiblePassword = list.get(i).substring(secondDot + 1, thirdDot);


                    if (possibleUsername.equals(login)) {
                        System.out.println("Введіть свій пароль: ");
                        String password = scan.nextLine();

                        if (password.equals(possiblePassword)) {
                            Navigation.startNavigation();
                        } else {
                            System.out.println("Виникла помилка, невірний пароль.");
                            Login.startLogin();
                        }

                    }
                }

                System.out.println("Такого користувача не знайдено.\n" +
                        "Бажаєте зареєструватися? \n" +
                        "1. Перейти до реєстрації    2. Спробувати ще раз");
                String newline = scan.nextLine();
                switch (newline) {
                    case "1":
                        Registration.createAccount();
                        break;
                    case "2":
                        Login.startLogin();
                        break;
                    default:
                        System.out.println("Оберіть один із ваоріантів");


                }
            }
        }
    }
}





