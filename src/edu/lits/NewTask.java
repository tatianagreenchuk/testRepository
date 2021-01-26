package edu.lits;

import edu.lits.model.Answer;
import edu.lits.model.Difficulty;
import edu.lits.model.Task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static edu.lits.model.WriterFileUser.writerFile;

public class NewTask {
    public static void main(String[] args) {
        createNewTask();
    }

    public static void createNewTask() {

        createTask();

        while (true) {
            writerFile.add("Створюємо завдання");
            System.out.println();
            System.out.println("1 - Створити нове завдання");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("> ");
            Scanner n1 = new Scanner(System.in);
            String menu = n1.nextLine();
            switch (menu) {
                case "1":
                    createTask();
                    continue;
                case "2":
                    break;
                default:
                    continue;
            }
            break;
        }
    }

    //метод який створює нове завдання
    static public void createTask() {
        Task newTask = new Task(); //створюємо об'єкт newTask
        newTask.setAuthor(Main.loginUser); //заповнюємо поле автора
        Scanner scanner = new Scanner(System.in); //заповнюємо поле складності запитання
        boolean stayInLoop = true;
        while (stayInLoop) {
            System.out.println();
            System.out.println("< Який рівень складності вашого завдання >");
            System.out.println("1 - простий");
            System.out.println("2 - середній");
            System.out.println("3 - складний");
            System.out.print("> ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    newTask.setLevel(Difficulty.EASY);
                    stayInLoop = false;
                    break;
                case "2":
                    newTask.setLevel(Difficulty.MIDDLE);
                    stayInLoop = false;
                    break;
                case "3":
                    newTask.setLevel(Difficulty.HARD);
                    stayInLoop = false;
            }
        }
        int easyTask = 0; //заповнюємо поле номера запитання
        int middleTask = 0;
        int hardTask = 0;
        for (Task i : Main.taskList) {
            switch (i.getLevel()) {
                case EASY:
                    easyTask++;
                    break;
                case MIDDLE:
                    middleTask++;
                    break;
                case HARD:
                    hardTask++;
            }
        }
        switch (newTask.getLevel()) {
            case EASY:
                newTask.setNumber(easyTask+1);
                break;
            case MIDDLE:
                newTask.setNumber(middleTask+1);
                break;
            case HARD:
                newTask.setNumber(hardTask+1);
        }
        System.out.println(); //заповнюємо поле тексту запитання
        System.out.println("Введіть текст нового завдання");
        System.out.print("> ");
        String taskLine = scanner.nextLine();
        newTask.setText(taskLine);
        System.out.println(); //заповнюємо поле варіантів відповідей
        System.out.println("Використовуючи символ '/' перелічіть всі варіанти відповідей" +
                "\nВкінці правильної відповіді поставте символ '*'" +
                "\nнаприклад: red/green/blue*/yellow");
        System.out.print("> ");
        newTask.answerList = new ArrayList<>();
        String answerLine = scanner.nextLine();
        String[] answerArray = answerLine.split("/");
        for (int i = 0 ; i < answerArray.length ; i++) {
            Answer answer = new Answer(); //створюємо новий об'єкт answer
            answer.setNumber(i+1); //заповнюємо поле номера відповіді
            if (answerArray[i].endsWith("*")) { //заповнюємо поле правильності та поле тексту відповіді
                answer.setCorrect((byte) 1);
                answer.setText(answerArray[i].substring(0,answerArray[i].length()-1));
            } else {
                answer.setCorrect((byte) 0);
                answer.setText(answerArray[i]);
            }
            newTask.answerList.add(answer); //додаємо об'єкт answer до списку answerList
        }
        stayInLoop = true; //виводимо меню
        while (stayInLoop) {
            System.out.println();
            System.out.println("1 - переглянути завдання");
            System.out.println("2 - редагувати завдання");
            System.out.println("3 - зберегти завдання");
            System.out.println("4 - не зберігати завдання");
            System.out.print("> ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    previewTask(newTask);
                    break;
                case "2":
                    editTask(newTask, taskLine, answerLine);
                    break;
                case "3":
                    saveTask(newTask);
                    stayInLoop = false;
                    break;
                case "4":
                    stayInLoop = false;
            }
        }
    }

    //метод який дозволяє зробити попередній перегляд завданням перед збереженням
    static public void previewTask(Task newTask) {
        Answer rightAnswer = null;
        Answer userAnswer = null;
        System.out.println(); //виводимо завдання на екран та заносимо правильну відповідь в змінну rightAnswer
        System.out.println(newTask.getNumber() + ". " + newTask.getText());
        for (Answer i : newTask.answerList) {
            System.out.println(i.getNumber() + ") " + i.getText());
            if (i.isCorrect() == 1) {
                rightAnswer = i;
            }
        }
        System.out.print("Ваша відповідь: "); //заносимо відповідь корисувача в змінну userAnswer
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        for (Answer i : newTask.answerList) {
            try {
                if (i.getNumber() == Integer.parseInt(option)) {
                    userAnswer = i;
                }
            } catch (NumberFormatException e) {
                userAnswer = null;
            }
        }
        if (rightAnswer == null) { //перевірка чи користувач не забув вказати який із варіантів відповідей правильний
            System.out.println("_____________________ ");
            System.out.println("Ви не вказали правильну відповідь");
            System.out.println();
            return;
        }
        if (userAnswer == null) { //перевірка чи користувач не вказав номер відповіді якої немає в списку варіантів
            System.out.println("_____________________ ");
            System.out.println("Невірно. Правильна відповідь: " + rightAnswer.getText());
            System.out.println();
            return;
        }
        if (rightAnswer.getNumber() == userAnswer.getNumber()) { //перевірка чи користувач дав правильну відповідь
            System.out.println("_____________________ ");
            System.out.println("Вірно!");
        } else {
            System.out.println("_____________________ ");
            System.out.println("Невірно. Правильна відповідь: " + rightAnswer.getText());
        }
    }

    //метод який дозволяє редагувати завдання
    static public void editTask(Task newTask, String taskLine, String answerLine) {
        Scanner scanner = new Scanner(System.in); //задаємо нові варіанти запитання та відповідей
        System.out.println();
        System.out.println(taskLine);
        System.out.print("> ");
        String newTaskLine = scanner.nextLine();
        System.out.println();
        System.out.println(answerLine);
        System.out.print("> ");
        String newAnswerLine = scanner.nextLine();
        newTask.setText(newTaskLine); //заповнюємо поле тексту запитання
        newTask.answerList.clear(); //заповнюємо поле варіантів відповідей
        String[] answerArray = newAnswerLine.split("/");
        for (int i = 0 ; i < answerArray.length ; i++) {
            Answer answer = new Answer(); //створюємо новий об'єкт answer
            answer.setNumber(i+1); //заповнюємо поле номера відповіді
            if (answerArray[i].endsWith("*")) { //заповнюємо поле правильності та поле тексту відповіді
                answer.setCorrect((byte) 1);
                answer.setText(answerArray[i].substring(0,answerArray[i].length()-1));
            } else {
                answer.setCorrect((byte) 0);
                answer.setText(answerArray[i]);
            }
            newTask.answerList.add(answer); //додаємо об'єкт answer до списку answerList
        }
    }

    //метод який дозволяє зберегти завдання в список taskList і файл task_list.txt
    static public void saveTask(Task newTask) {
        Main.taskList.add(newTask); //додаємо завдання в список taskList
        try (PrintStream file = new PrintStream(new FileOutputStream(Main.TASK_FILE_NAME, true))) { //додаємо завдання в файл task_list.txt
            file.println();
            String taskLine = String.join(".", newTask.getAuthor(), String.valueOf(newTask.getLevel()), String.valueOf(newTask.getNumber()), newTask.getText());
            file.println(taskLine);
            for (Answer i : newTask.answerList) {
                String answerLine = String.join(".", String.valueOf(i.getNumber()), String.valueOf(i.isCorrect()), i.getText());
                file.println(answerLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        }
    }
}
