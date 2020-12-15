package edu.lits;

import java.util.Scanner;

import static edu.lits.model.WriterFileUser.writerFile;

public class Navigation {

    public static void main(String[] args) {
        startNavigation();
    }

    static void startNavigation() {
        String line = "";
        while (!"4".equals(line)) {
            System.out.println();
            System.out.println("< Головне меню >\n" +
                    "1 - Створити нове завдання\n" +
                    "2 - Пройти тестування\n" +
                    "3 - Показати дошку лідерів\n" +
                    "4 - Повернутися до меню Авторизації\n" +
                    "Оберіть опцію: ");
            Scanner scan = new Scanner(System.in);
            line = scan.nextLine();
            switch (line) {
                case "1":
                    NewTask.createNewTask();
                    writerFile.add("Повернулись до навігації");
                    break;
                case "2":
                    Testing.startTesting();
                    writerFile.add("Повернулись до навігації");
                    break;
                case "3":
                    LeaderBoard.showLeaderBoard();
                    writerFile.add("Повернулись до навігації");
                    break;
                case "4":
                    writerFile.add(" Повернулись до Авторизації");
                    break;
                default:
                    writerFile.add("Будь ласка, оберіть опцію від 1 до 4");
                    System.out.println("Будь ласка, оберіть опцію від 1 до 4");
                    break;
            }
        }
    }
}
