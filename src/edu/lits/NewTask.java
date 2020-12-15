package edu.lits;

import java.util.Scanner;

import static edu.lits.model.WriterFileUser.writerFile;

public class NewTask {
    public static void main(String[] args) {
        createNewTask();
    }

    public static void createNewTask() {
        String menu = "";
        if ("2".equals(menu)){
            writerFile.add("Завершили створення завдання");
        }
        while (!"2".equals(menu)) {
            System.out.println();
            System.out.println("1 - Створити нове завдання");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("Оберіть опцію: ");
            Scanner n1 = new Scanner(System.in);
            menu = n1.nextLine();
            if ("1".equals(menu)) {
                writerFile.add("Створюємо завдання");
                System.out.println();
                System.out.println("Створюємо завдання ...");
            }
        }
    }
}
