package edu.lits;

import java.util.Scanner;
import java.util.ArrayList;

import edu.lits.model.Task;
import edu.lits.model.ArrayFileUser;
import edu.lits.model.User;

import static edu.lits.Navigation.startNavigation;
import static edu.lits.model.WriterFileUser.writerFile;
import static edu.lits.model.WriterFileUser.writerFileUser;

public class Main {
    public static final String FILE_USERS = "User.txt";
    public static final String TASK_FILE_NAME = "task_list.txt";
    public static ArrayList<Task> taskList;
    public static String loginUser;
    public static ArrayList<User>arrayUser=ArrayFileUser.arraySort();
    public static ArrayList<String>arrayLoginUser=ArrayFileUser.loginString();

    public static void main(String[] args) {

        taskList = ArrayFileUser.createTaskArrayList();
        writerFile.add("Розпочали роботу");
        start();
    }

    public static void start() {
        String menu = "";
        while (!"3".equals(menu)) {
            System.out.println();
            System.out.println("< Авторизація >\n" +
                    "1 - Створити новий обліковий запис\n" +
                    "2 - Увійти\n" +
                    "3 - Завершити роботу\n" +
                    "Оберіть опцію: ");
            Scanner scan = new Scanner(System.in);
            String account = scan.nextLine();
            if ("1".equals(account) || "1".equals(account))// напевно треба видалити
                if ("1".equals(account)) {
                    writerFile.add("Реєструєм логін та пароль");
                    Registration.createAccount();
                    writerFile.add("Успішно зареєструвалися, переходим до навігації");
                    startNavigation();
                }
            if ("2".equals(account)) {
                writerFile.add("Перквіряєм логін та пароль");
                Login.startLogin();
                writerFile.add("Успішно залогінелись, переходим в навігацію");
                startNavigation();
            }
            if ("3".equals(account)) {
                menu = "3";
            }
        }
        writerFile.add("Завершуєм роботу");
        writerFileUser();
        System.exit(0);
    }
}
