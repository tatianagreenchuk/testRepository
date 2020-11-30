package edu.lits;

import java.util.Scanner;

public class CreateTask {
    public static void main(String[] args) {
        createTask();
    }

    public static void createTask() {
        int n;
        System.out.println("1+Enter - вийти з програми");
        System.out.println("2+Enter - вивчати нові слова");
        Scanner n1 = new Scanner(System.in);
        n = n1.nextInt();
        while (n != 1) {
            n = n1.nextInt();

            if (n == 2) {
                System.out.println("вивчаємо нові слов");


            }
        }
        System.out.println("Welcome! Please choose what you are looking for:\n" +
                "1) ..Go Back..      2) ..Create Task..  " +
                "    3) ..Test Me..    4) ..Leaderboard..");
    }
}
