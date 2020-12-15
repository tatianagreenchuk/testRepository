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
                    System.out.println("Ви успішно зареєструвалися");
                }else {
                    System.out.println("такий пароль не зареєстрований за цим логіном");
                    System.out.println("почніть з початку");
                    writerFile.add("Такий пароль не зареєстрований за цим логіном,Починаємо з початку");
                    start();
                }  } else {
            System.out.println("Виникла помилка, невірний логін");
            System.out.println("почніть з початку");
            writerFile.add("Виникла помилка, невірний логін,Починаємо з початку");
            start();
        }
    }
}
