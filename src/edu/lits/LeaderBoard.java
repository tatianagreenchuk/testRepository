package edu.lits;

import static edu.lits.model.WriterFileUser.writerFile;

public class LeaderBoard {

    static void showLeaderBoard() {
                         System.out.println();
                    System.out.println("Наші лідери:\n");
                    writerFile.add("Вивели дошку лідерів");

                    for (String s : Main.arrayLoginUser){
                      System.out.println(s);
                    }

    }
}

