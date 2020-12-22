package edu.lits.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.lits.Main;

public class ArrayFileUser {

    public static List<String> arrayFile() {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(Path.of(Main.FILE_USERS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ArrayList<String> loginString = new ArrayList<>();
//
//   public static void main(String[] args) {
//
//        for (User i:arraySort()) {
//            loginString.add(i.getLogin());
//        }
//        int n = loginString.indexOf("nazar");
//       System.out.println(n);
//
//   }

    public static ArrayList<User> arraySort() {
        ArrayList<User> idInt = new ArrayList<>();
        for (String s : arrayFile()) {
            User user = new User();//ось тут його обявляти тоді все норм
            int x = s.indexOf(",");
            int x2 = s.indexOf(",", s.indexOf(",", x + 1) + 1);
            int x3 = s.indexOf(",", x2 + 1);
            int x4 = s.indexOf(",", x3 + 1);
            int x5 = s.indexOf(",", x4 + 1);
            int x6 = s.indexOf(",", x5 + 1);
            int x7 = s.indexOf(",", x6 + 1);
            int x8 = s.indexOf(",", x7 + 1);
            int x9 = s.indexOf(",", x8 + 1);
            int x10 = s.indexOf(",", x9 + 1);
            user.setId(Integer.parseInt(s.substring(0, x)));
            user.setLogin(s.substring(x + 1, s.indexOf(",", x + 1)));
            user.setPassword(s.substring(s.indexOf(",", x + 1) + 1, x2));
            user.setEasyAnswerCount(Integer.parseInt(s.substring(x2 + 1, x3)));
            user.setMiddleAnswerCount(Integer.parseInt(s.substring(x3 + 1, x4)));
            user.setHardAnswerCount(Integer.parseInt(s.substring(x4 + 1, x5)));
            user.setName(s.substring(x5 + 1, x6));
            user.setSurname(s.substring(x6 + 1, x7));
            user.setDateOfBirth(s.substring(x7 + 1, x8));
            user.setEmail(s.substring(x8 + 1, x9));
            user.setCountry(s.substring(x9 + 1, x10));
            user.setCity(s.substring(x10 + 1, s.indexOf(";")));

            idInt.add(user);

        }return idInt;
    }

    //метод який переносить завдання із файлу task_list.txt в колекцію taskList
    static public ArrayList<Task> createTaskArrayList() {
        ArrayList<Task> taskList = new ArrayList<>();
        try (Scanner file = new Scanner(new File(Main.TASK_FILE_NAME))) {
            String line;
            while (file.hasNext()) {
                line = file.nextLine();
                Task task = new Task(line);
                task.answerList = new ArrayList<>();
                line = file.nextLine();
                while (!"".equals(line)) {
                    Answer answer = new Answer(line);
                    task.answerList.add(answer);
                    if (file.hasNext()) {
                        line = file.nextLine();
                    } else {
                        break;
                    }
                }
                taskList.add(task);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл task_list.txt не знайдено");
        }
        return taskList;
    }
}
