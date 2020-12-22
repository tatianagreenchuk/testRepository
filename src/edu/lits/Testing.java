package edu.lits;

import java.util.ArrayList;
import java.util.Scanner;

import edu.lits.model.*;

import static edu.lits.model.WriterFileUser.writerFile;

public class Testing {
    static ArrayList<Integer> rightAnswers = new ArrayList<>();

    static void startTesting() {
        String menu = "";
        boolean stayInLoop = true;
        while (stayInLoop) {
            writerFile.add("запускаємо тестування");
            runUserTesting();
            System.out.println("1 - Пройти нове тестування");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("виберіть опцію: ");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine();
            switch (menu) {
                case "1":
                    break;
                case "2":
                    stayInLoop = false;
                    break;
                default:
                    stayInLoop = false;
            }
        }
    }

    static public void runUserTesting() {
        Scanner scanner = new Scanner(System.in);
        Difficulty difficulty = null;
        boolean stayInLoop = true;
        while (stayInLoop) {
            System.out.println();
            System.out.println("< Рівень складності >");
            System.out.println("1 - простий");
            System.out.println("2 - середній");
            System.out.println("3 - складний");
            System.out.print("виберіть опцію: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    difficulty = Difficulty.EASY;
                    stayInLoop = false;
                    break;
                case "2":
                    difficulty = Difficulty.MIDDLE;
                    stayInLoop = false;
                    break;
                case "3":
                    difficulty = Difficulty.HARD;
                    stayInLoop = false;
            }
        }
        System.out.println();
        for (Task i : Main.taskList) {
            if (i.getLevel() != difficulty) {
                continue;
            }
            Answer rightAnswer = null;
            Answer userAnswer = null;
            System.out.println(i.getNumber() + ". " + i.getText());
            for (Answer j : i.answerList) {
                System.out.println(j.getNumber() + ") " + j.getText());
                if (j.isCorrect() == 1) {
                    rightAnswer = j;
                }
            }
            System.out.print("виберіть відповідь: ");
            String option = scanner.nextLine();
            for (Answer j : i.answerList) {
                if (j.getNumber() == Integer.parseInt(option)) {
                    userAnswer = j;
                }
            }

            if (rightAnswer == null) {
                System.out.println("_____________________ ");
                System.out.println("Нажаль автор запитання забув вказати правильну відповідь");
                System.out.println();
                continue;
            }

            if (userAnswer == null) {
                System.out.println("_____________________ ");
                System.out.println("Невірно. Правильна відповідь: " + rightAnswer.getText());
                System.out.println();
                continue;
            }

            if (rightAnswer.getNumber() == userAnswer.getNumber()) {
                System.out.println("_____________________ ");
                System.out.println("Вірно!");
                rightAnswers.add(1);
            } else {
                System.out.println("_____________________ ");
                System.out.println("Невірно. Правильна відповідь: " + rightAnswer.getText());
            }
            System.out.println();


        }
        System.out.println("Кількість вірних відповідей: " + rightAnswers.size());


    }
}


