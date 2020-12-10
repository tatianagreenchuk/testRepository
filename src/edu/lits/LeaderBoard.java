package edu.lits;

import edu.lits.model.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaderBoard {

    static void showLeaderBoard() {
        LeadMen menu = null;
        while (menu != LeadMen.BACK) {
            System.out.println();
            System.out.println("1 - Показати дошку лідерів");
            System.out.println("2 - Повернутися до головного меню");
            System.out.print("виберіть опцію: ");
            Scanner sc = new Scanner(System.in);
            String menuOption = sc.nextLine();

            for (LeadMen i : LeadMen.values()) {
                if (menuOption.equals(i.menuNumber)) {
                    menu = i;
                }
            }
            switch (menu) {
                case START:
                    System.out.println();
                    System.out.println("Наші лідери:\n");
                    printUserList(readAllUsers());
                    break;
                case BACK:
                    break;
                default:
                    System.out.println("Please, choose an option from 1 to 2");
            }

        }
        ArrayList<User> userArrayList = readAllUsers();
        printUserList(userArrayList);
        printUserList(userArrayList);
    }

    private static ArrayList<User> readAllUsers() {
        ArrayList<User> userArrayList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(Paths.get(Main.FILE_USERS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : result) {

            userArrayList.add(getUser(line));

        }
        return userArrayList;
    }

    private static User getUser(String line) {
        User user = new User();
        int positionOfFirstDot = line.indexOf(".");
        String possibleIdString = line.substring(0, positionOfFirstDot);
        int possibleId = Integer.parseInt(possibleIdString);
        user.setId(possibleId);

        int positionOfSecondDot = line.indexOf(".", positionOfFirstDot + 1);
        String possibleLogin = line.substring(positionOfFirstDot + 1, positionOfSecondDot);
        user.setLogin(possibleLogin);

        return user;
    }

    private static void printUserList(ArrayList<User> userList) {
        for (User user : userList) {
            System.out.println(user.getLogin());
        }

    }
}

