package edu.lits;

import java.util.Scanner;

public class CreateTask {
    public static void main(String[] args) {
        createTask();
    }

    public static void createTask() {
        String menu = "";
        while (!"2".equals(menu)) {
            System.out.println();
            System.out.println("1 - Створити нове завдання");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("виберіть опцію: ");
            Scanner n1 = new Scanner(System.in);
            menu = n1.nextLine();
            if ("1".equals(menu)) {
                System.out.println();
                System.out.println("створюємо завдання ...");
            }
        }
    }
}
