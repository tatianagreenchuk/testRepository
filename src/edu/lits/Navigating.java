package edu.lits;

import java.util.Scanner;

public class Navigating {

    public static void main(String[] args) {
        navigating();
    }

    static void navigating() {
        String line = "";
        while (!"4".equals(line)) {
            System.out.println();
            System.out.println("< Головне меню >");
            System.out.println("1 - Створити нове завдання");
            System.out.println("2 - Пройти тестування");
            System.out.println("3 - Показати дошку лідерів");
            System.out.println("4 - Повернутися до меню Авторизації");
            System.out.print("виберіть опцію: ");
            Scanner scan = new Scanner(System.in);
            line = scan.nextLine();
            switch (line) {
                case "1":
                    CreateTask crt = new CreateTask();
                    crt.createTask();
                    break;
                case "2":
                    TestMe tm = new TestMe();
                    tm.testMe();
                    break;
                case "3":
                    LeaderBoard lb = new LeaderBoard();
                    lb.leaderBoard();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Please, choose an option from 1 to 4");
                    break;
            }
        }
    }
}
