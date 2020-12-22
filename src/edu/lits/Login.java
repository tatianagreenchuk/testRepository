package edu.lits;


import edu.lits.model.User;

import java.util.ArrayList;
import java.util.Scanner;
import static edu.lits.Main.start;
import static edu.lits.model.WriterFileUser.writerFile;

public class Login {

    public static void main(String[] args)  {
        startLogin();
    }

    public static void startLogin()  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть свій логін: ");
        String login = scan.nextLine();

        boolean userName=Main.arrayLoginUser.contains(login);
        if (userName){
            System.out.println("Введіть свій пароль: ");
            String password = scan.nextLine();

            int n = Main.arrayLoginUser.indexOf(login);
            boolean passwordUser = password.contains(Main.arrayUser.get(n).getPassword());
                if (passwordUser){
                    Main main = new Main();
                    main.loginUser = login;
                    System.out.println("Ви увійшли в свій аккаунт");
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
