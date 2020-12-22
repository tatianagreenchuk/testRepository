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
        //arraySort();
        ArrayList<String>loginString=new ArrayList<>();
       for (User i:Main.arrayUser){
           loginString.add(i.getLogin());
       }
        boolean userName=loginString.contains(login);
        if (userName){
            System.out.println("Введіть свій пароль: ");
            String password = scan.nextLine();

            int n = loginString.indexOf(login);
            boolean passwordUser = Main.arrayUser.get(n).getPassword().contains(password);
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
