package edu.lits;

import java.util.Scanner;

import edu.lits.model.*;

import static edu.lits.Main.arrayLoginUser;
import static edu.lits.model.WriterFileUser.writFileUserNewResult;
import static edu.lits.model.WriterFileUser.writerFile;

public class Testing {

    static void startTesting() {

        runUserTesting();

        String menu;
        while (true) {
            writerFile.add("запускаємо тестування");
            System.out.println();
            System.out.println("1 - Пройти нове тестування");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine();
            switch (menu) {
                case "1":
                    runUserTesting();
                    continue;
                case "2":
                    break;
                default:
                    continue;
            }
            break;
        }
    }

    static public void runUserTesting() {
        int rightAnswers =0;
        int wrongAnswers = 0;
        Scanner scanner = new Scanner(System.in);
        Difficulty difficulty = null;
        boolean stayInLoop = true;
        while (stayInLoop) {
            System.out.println();
            System.out.println("< Рівень складності >");
            System.out.println("1 - простий");
            System.out.println("2 - середній");
            System.out.println("3 - складний");
            System.out.print("> ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    difficulty = Difficulty.EASY;
                    stayInLoop = false;
                    diffic=3;
                    break;
                case "2":
                    difficulty = Difficulty.MIDDLE;
                    stayInLoop = false;
                    diffic=4;
                    break;
                case "3":
                    difficulty = Difficulty.HARD;
                    stayInLoop = false;
                    diffic=5;
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
            System.out.print("Ваша відповідь: ");
            String option = scanner.nextLine();
            for (Answer j : i.answerList) {
                try {
                    if (j.getNumber() == Integer.parseInt(option)) {
                        userAnswer = j;
                    }
                } catch (NumberFormatException e) {
                    userAnswer = null;
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
                wrongAnswers++;
                continue;
            }

            if (rightAnswer.getNumber() == userAnswer.getNumber()) {
                System.out.println("_____________________ ");
                System.out.println("Вірно!");
                rightAnswers++;
            } else {
                System.out.println("_____________________ ");
                System.out.println("Невірно. Правильна відповідь: " + rightAnswer.getText());
                wrongAnswers++;
            }
            System.out.println();
        }

        rightAns = rightAnswers;
        enterCorrectAnswer();
        System.out.println("Кількість вірних відповідей: " + rightAnswers);
        System.out.println("Кількість невірних відповідей: " + wrongAnswers);
        System.out.println();
        if (rightAnswers < wrongAnswers) {
            System.out.println("Поганий результат. Спробуй ще раз!");
        }
    }

    public static int rightAns;
    public static int diffic;
    public static void enterCorrectAnswer() {
        int index = arrayLoginUser.indexOf(Main.loginUser);
        int elem;
        switch (diffic) {
            case 3:
                elem = Main.arrayUser.get(index).getEasyAnswerCount();
                elem = elem + rightAns;
                Main.arrayUser.get(index).setEasyAnswerCount(elem);
                break;
            case 4:
                elem = Main.arrayUser.get(index).getMiddleAnswerCount();
                elem = elem + rightAns;
                Main.arrayUser.get(index).setMiddleAnswerCount(elem);
                break;
            case 5:
                elem = Main.arrayUser.get(index).getHardAnswerCount();
                elem = elem + rightAns;
                Main.arrayUser.get(index).setHardAnswerCount(elem);
                break;
        }
        writFileUserNewResult();
    }
}




