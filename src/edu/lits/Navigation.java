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
                    writerFile.add("NewTask.createNewTask();");
                    NewTask.createNewTask();
                    break;
                case "2":
                    writerFile.add("Testing.startTesting();");
                    Testing.startTesting();
                    break;
                case "3":
                    writerFile.add("LeaderBoard.showLeaderBoard();");
                    LeaderBoard.showLeaderBoard();
                    break;
                case "4":
                    writerFile.add("4 - Повернутися до меню Авторизації");
                    break;
                default:
                    writerFile.add("Будь ласка, оберіть опцію від 1 до 4");
                    System.out.println("Будь ласка, оберіть опцію від 1 до 4");
                    break;
            }
        }
    }
}
