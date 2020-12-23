package edu.lits.model;

import edu.lits.Main;

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
    public static void writFileUserNewResult() {
        try {
            PrintWriter wri = new PrintWriter(new BufferedWriter(new FileWriter(Main.FILE_USERS)));
            for (int i = 0; i < Main.arrayUser.size(); i++) {
                wri.println(Main.arrayUser.get(i).getId() + "|" + Main.arrayUser.get(i).getLogin() +
                        "|" + Main.arrayUser.get(i).getPassword() + "|" + Main.arrayUser.get(i).getEasyAnswerCount() +
                        "|" + Main.arrayUser.get(i).getMiddleAnswerCount() + "|" + Main.arrayUser.get(i).getHardAnswerCount() +
                        "|" + Main.arrayUser.get(i).getName() + "|" + Main.arrayUser.get(i).getSurname() +
                        "|" + Main.arrayUser.get(i).getDateOfBirth() + "|" + Main.arrayUser.get(i).getEmail() +
                        "|" + Main.arrayUser.get(i).getCountry() + "|" + Main.arrayUser.get(i).getCity());

            }wri.flush();
            wri.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//10,gennadii,00000,6правельнЛег,7правСере,8ПавВаш,gennadii,petrov,9-10-1985,genchik@gmail.com,ukraine,vinnytsia;
    }
}
