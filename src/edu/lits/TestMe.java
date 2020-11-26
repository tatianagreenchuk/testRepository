package edu.lits;

import java.util.Scanner;

public class TestMe {

    static String task;

    public static void main(String[] args) {
        testMe();
    }

    public static void testMe() {

        boolean stayInMenu = true;

        while (stayInMenu) {
            System.out.println();
            System.out.println("1. go back");
            System.out.println("2. choose task");
            System.out.println("3. run task");
            System.out.print("choose option: ");

            Scanner textInput = new Scanner(System.in);

            String menuOption = textInput.nextLine();

            switch (menuOption) {
                case "1":
                    stayInMenu = false;
                    break;
                case "2":
                    chooseTask();
                    break;
                case "3":
                    System.out.println();
                    if (task == null) {
                        System.out.println("please choose task");
                    } else {
                        System.out.println("start task " + task);
                        stayInMenu = false;
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("unknown option please try again");
            }
        }
    }

    public static void chooseTask() {
        String [] taskList = {"1. lesson 1", "2. lesson 2", "3. lesson 3", "4. lesson 4", "5. lesson 5"};
        System.out.println();
        for (String i: taskList) {
            System.out.println(i);
        }
        System.out.print("choose task: ");

        Scanner textInput = new Scanner(System.in);

        String taskNumber = textInput.nextLine();
        int i = Integer.parseInt(taskNumber);

        task = taskList[i-1];
    }
}
