package edu.lits;

import edu.lits.model.ArrayFileUser;
import edu.lits.model.User;

import java.util.ArrayList;

import static edu.lits.model.WriterFileUser.writerFile;

public class LeaderBoard {

    static void showLeaderBoard() {
        System.out.println();
        System.out.println("Наші лідери:\n");
        writerFile.add("Вивели дошку лідерів");
        showEasyDifficulty();
        System.out.println();
        showMiddleDifficulty();
        System.out.println();
        showHardDifficulty();
    }

    public static void showEasyDifficulty() {
        ArrayList<User> arrayList = ArrayFileUser.arraySort();
        User[] users = new User[arrayList.size()];
        users = arrayList.toArray(users);
//бульбашкове сортування
        User user_min;
        for (int i = 0; i < users.length - 1; i++) {
            for (int j = users.length - 1; j > i; j--) {
                if (users[j - 1].getEasyAnswerCount() < users[j].getEasyAnswerCount()) {
                    user_min = users[j - 1];
                    users[j - 1] = users[j];
                    users[j] = user_min;
                }
            }
        }
        // виведення 3 лідерів
        System.out.println("Легка складність:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " місце - " + users[i].getLogin() + " з результатом - " + users[i].getEasyAnswerCount());

        }

    }

    public static void showMiddleDifficulty() {
        ArrayList<User> arrayList = ArrayFileUser.arraySort();
        User[] users = new User[arrayList.size()];
        users = arrayList.toArray(users);

        User user_min;

        for (int i = 0; i < users.length - 1; i++) {
            for (int j = users.length - 1; j > i; j--) {
                if (users[j - 1].getMiddleAnswerCount() < users[j].getMiddleAnswerCount()) {
                    user_min = users[j - 1];
                    users[j - 1] = users[j];
                    users[j] = user_min;
                }
            }
        }
        System.out.println("Середня складність:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " місце - " + users[i].getLogin() + " з результатом - " + users[i].getMiddleAnswerCount());

        }

    }

    public static void showHardDifficulty() {
        ArrayList<User> arrayList = ArrayFileUser.arraySort();
        User[] users = new User[arrayList.size()];
        users = arrayList.toArray(users);

        User user_min;

        for (int i = 0; i < users.length - 1; i++) {
            for (int j = users.length - 1; j > i; j--) {
                if (users[j - 1].getHardAnswerCount() < users[j].getHardAnswerCount()) {
                    user_min = users[j - 1];
                    users[j - 1] = users[j];
                    users[j] = user_min;
                }
            }
        }
        System.out.println("Важка складність:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " місце - " + users[i].getLogin() + " з результатом - " + users[i].getHardAnswerCount());

        }

    }
}

