package edu.lits;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String menuOption = "0";
        while ("0".equals(menuOption)) {
            System.out.println();
            System.out.println("<меню реєстрації>");
            System.out.println("1: повернутись назад");
            System.out.println("2: зареєструватися");
            System.out.print("виберіть опцію: ");
            Scanner textInput = new Scanner(System.in);
            menuOption = textInput.nextLine();
            switch (menuOption) {
                case "1":
                    break;
                case "2":
                    System.out.println();
                    System.out.println("<введіль ваші дані>");
                    System.out.print("Логін: ");
                    String login = textInput.nextLine();
                    System.out.print("Пароль: ");
                    String password = textInput.nextLine();
                    System.out.print("повторіть Пароль: ");
                    String passwordRepeat = textInput.nextLine();

                    String completeReg = "0";
                    while ("0".equals(completeReg)) {
                        System.out.println();
                        System.out.println("<створення облікового запису>");
                        System.out.println("1: завершити реєстрацію");
                        System.out.println("2: відміна реєстрації");
                        System.out.print("виберіть опцію: ");
                        completeReg = textInput.nextLine();
                        switch (completeReg) {
                            case "1":
                                System.out.println();
                                System.out.println("Вітаємо! Реєстрація пройшла успішно");
                                break;
                            case "2":
                                System.out.println();
                                System.out.println("реєстрація відмінена");
                                menuOption = "0";
                                break;
                            default:
                                System.out.println();
                                System.out.println("невідома опція спробуйте ще раз");
                                completeReg = "0";
                        }
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("невідома опція спробуйте ще раз");
                    menuOption = "0";
            }
        }
    }
}
