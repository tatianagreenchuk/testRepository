package edu.lits;

import java.util.Scanner;

public class CreateTask {
    public CreateTask() {
    }

    public void CreateTask() {
        сreateTask();
    }

    private static void сreateTask() {
        int nz = 2;
        int n;
        System.out.println("1+Enter - вийти з програми");
        System.out.println("2+Enter - вивчати нові слова");
        while (nz != 1) {
            Scanner n1 = new Scanner(System.in);
            n = n1.nextInt();
            if (n == 2) {
                System.out.println("вивчаємо нові слов");
            } else {

            }
        }
        Navigation navigation = new Navigation();
        new Navigation().Navigatia();
    }


//    private static void сreateTask() {
//        int n;
//        System.out.println("1+Enter - вийти з програми");
//        System.out.println("2+Enter - вивчати нові слова");
//        Scanner n1 = new Scanner(System.in);
//        n = n1.nextInt();
//        while (n != 1) {
//
//            if (n == 2) {
//                System.out.println("вивчаємо нові словa");
//            } else {
//                System.out.println("Please, choose an option from 1 or 2");
//
//
//            }
//            n = n1.nextInt();
//        }
//
//        new Navigation().Navigatia();
//    }
//
}


