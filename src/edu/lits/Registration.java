package edu.lits;

import edu.lits.model.ArrayFileUser;

import java.util.Scanner;

import static edu.lits.Main.start;
import static edu.lits.model.WriterFileUser.writerFile;
public class Registration {
    static final String CHOOSE = "Оберіть опцію: ";
    static final String LOGIN = "Ваш новий логін: ";
    static final String PASSWORD = "Ваш новий пароль: ";
    static final String REPEAT = "Повторіть новий пароль: ";



    public static void createAccount()  {

            Scanner textInput = new Scanner(System.in);
                    System.out.print(LOGIN);
                    String login = textInput.nextLine();

                    ArrayFileUser arrayFileUser = new ArrayFileUser();
                    arrayFileUser.arraySort();
                    for (String s : arrayFileUser.loginString) {
                        if (login.equals(s)) {
                            System.out.println();
                            System.out.println("Такий логін вже існує.\n" +
                                    "Спробуйте увійти в свій обліковій запис");
                            writerFile.add("Тфкий логін вже існує,Починаємо з почетку");
                            start();
                        }
                    }
                    System.out.print(PASSWORD);
                    String password = textInput.nextLine();
                    System.out.print(REPEAT);
                    String passwordRepeat = textInput.nextLine();
                    writerFile.add( "login: "+login+", password: "+password);
            }
        }
