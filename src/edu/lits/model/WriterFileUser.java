package edu.lits.model;

import java.io.*;
import java.util.ArrayList;

public class WriterFileUser {
   public static ArrayList<String>writerFile=new ArrayList<>();
    public static void main(String[] args)  {
        writerFile.add("привет");
        writerFile.add("как дела");
        writerFile.add("все ок?");
        writerFile.add("ну давай");
        writerFile.add("удачи");

        String nameFile="WorkUser.txt";
        File work=new File(nameFile);
        try {
            PrintWriter works = new PrintWriter(new BufferedWriter(new FileWriter(work)));
      for (String s:writerFile){
       works.print(s+".");}
       works.flush();
       works.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
