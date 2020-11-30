package edu.lits;

import java.util.Scanner;

public class CreateTask {
    public static void main(String[] args) {
        сreateTask();
    }

    public static void сreateTask() {
        int nz = 2;
        int n;
        System.out.println("1+Enter - вийти з програми");
        System.out.println("2+Enter - вивчати нові слова");
        Scanner n1 = new Scanner(System.in);
        n = n1.nextInt();
        while (n != 1) {

            if (n == 2) {
                System.out.println("вивчаємо нові слов");

                n = n1.nextInt();

            }

        }Navigation nav = new Navigation();
        nav.navigation();
    }
}
