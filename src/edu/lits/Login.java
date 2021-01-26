package edu.lits;

import java.util.Scanner;
import static edu.lits.Main.start;
import static edu.lits.model.WriterFileUser.writerFile;

public class Login {

    public static void main(String[] args)  {
        startLogin();
    }

    public static void startLogin()  {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Введіть свій логін: ");
        String login = scan.nextLine();

        boolean userName=Main.arrayLoginUser.contains(login);
        if (userName){
            System.out.println();
            System.out.print("Введіть свій пароль: ");
            String password = scan.nextLine();

            int n = Main.arrayLoginUser.indexOf(login);
            boolean passwordUser = Main.arrayUser.get(n).getPassword().equals(password);
                if (passwordUser){
                    Main.loginUser = login;
                    System.out.println();
                    System.out.println("Ви увійшли в свій аккаунт");
                } else {
                    System.out.println();
                    System.out.println("Ви ввели невірний пароль");
                    System.out.println("почніть з початку");
                    writerFile.add("Такий пароль не зареєстрований за цим логіном,Починаємо з початку");
                    start();
                }
        } else {
            System.out.println();
            System.out.println("Виникла помилка, невірний логін");
            System.out.println("почніть з початку");
            writerFile.add("Виникла помилка, невірний логін,Починаємо з початку");
            start();
        }
    }
}
