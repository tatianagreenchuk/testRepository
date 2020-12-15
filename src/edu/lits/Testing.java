package edu.lits;

import java.util.Scanner;

import static edu.lits.model.WriterFileUser.writerFile;

public class Testing {

    static void startTesting() {
        String menu = "";
        while (!"2".equals(menu)) {
            System.out.println();
            System.out.println("1 - Пройти тестування");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("виберіть опцію: ");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine();
                switch (menu) {
                    case "1":
                        writerFile.add("запускаємо тестування");
                        System.out.println();
                        System.out.println("запускаємо тестування ...");
                        break;
                    case "2":
                        break;
                    default:
                        System.out.println("Please, choose an option from 1 to 2");
                }
        }
    }
}
