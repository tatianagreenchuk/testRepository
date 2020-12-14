package edu.lits;

import java.io.*;
import java.util.Scanner;
import static edu.lits.Main.start;
import static edu.lits.model.ArrayFileUser.*;
import static edu.lits.model.WriterFileUser.writerFile;

public class Login {
    public static void main(String[] args)  {
        startLogin();
    }

    public static void startLogin()  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть свій логін: ");
        String login = scan.nextLine();
        arraySort();
        boolean userName=loginString.contains(login);
        if (userName){
            System.out.println("Введіть свій пароль: ");
            String password = scan.nextLine();
            boolean passwordUser = passwordString.contains(password);
                if (passwordUser){
                    writerFile.add("Navigation.startNavigation()");
                }else {
                    System.out.println("тфкий пароль не зареєстрований за цим логіном");
                    System.out.println("почніть з початку");
                    start();
                }  } else {
            System.out.println("Виникла помилка, невірний логін");
            System.out.println("почніть з початку");
            start();
            writerFile.add("Login.startLogin();");
        }
    }
}
