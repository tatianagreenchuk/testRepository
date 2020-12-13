package edu.lits.model;

import java.io.*;
import java.util.ArrayList;

public class WriterFileUser {
   public static ArrayList<String>writerFile=new ArrayList<>();
    public static void main(String[] args)  {
    //    writerFile.add("");

       //writerFileUser();
    }

    public static void writerFileUser() {
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
