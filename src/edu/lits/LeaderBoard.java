package edu.lits;

import edu.lits.model.ArrayFileUser;

import static edu.lits.model.WriterFileUser.writerFile;

public class LeaderBoard {

    static void showLeaderBoard() {
                         System.out.println();
                    System.out.println("Наші лідери:\n");
                    writerFile.add("Наші лідери:");
                    ArrayFileUser arFil = new ArrayFileUser();
                    arFil.arraySort();
                    for (String s : arFil.loginString){
                        System.out.println(s);
                    }

    }

}

