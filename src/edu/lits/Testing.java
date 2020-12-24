package edu.lits;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import edu.lits.model.*;

import static edu.lits.Main.arrayLoginUser;
import static edu.lits.Main.arrayUser;
import static edu.lits.model.WriterFileUser.writFileUserNewResult;
import static edu.lits.model.WriterFileUser.writerFile;

public class Testing {

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
                default:
                    stayInLoop = false;
            }
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
            System.out.print("виберіть опцію: ");

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
            System.out.print("виберіть відповідь: ");
            String option = scanner.nextLine();
            for (Answer j : i.answerList) {
                if (j.getNumber() == Integer.parseInt(option)) {
                    userAnswer = j;
                }
            }
//  це Вова пишу сюди, бо потім забуду де саме то місце яке мене мучить, і я його не можу зрозуміти
            if (rightAnswer == null) { //не розумію навіщо цей if, ну наскільки я розумію він ніколи не спрацює
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
            } else {  // і ця частина нібито ніколи не спрацюе томущо спрацьовує continue з попереднього if, і викине з циклу
                System.out.println("_____________________ ");
                System.out.println("Невірно. Правильна відповідь: " + rightAnswer.getText());
                wrongAnswers++;
            }
            System.out.println();
               }
        rightAns=rightAnswers;
        enterCorrectAnswer();
        System.out.println("Кількість вірних відповідей: " + rightAnswers);
        System.out.println("Кількість невірних відповідей: " + wrongAnswers);
        System.out.println();
        if (rightAnswers< wrongAnswers) {
            System.out.println("Поганий результат. Спробуй ще раз!");
            System.out.println();

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




