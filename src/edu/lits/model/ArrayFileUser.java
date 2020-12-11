package edu.lits.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import static edu.lits.Main.FILE_USERS;
public class ArrayFileUser {

    public static List<String> arrayFile(){
      List<String> result =new ArrayList<>();
      try{
          result= Files.readAllLines(Path.of(FILE_USERS));
      } catch (IOException e) {
          e.printStackTrace();
      }
      return result;
    }
    public static ArrayList<Integer> idInt = new ArrayList<>();
    public static ArrayList<String> loginString = new ArrayList<>();
    public static ArrayList<String> passwordString =new ArrayList<>();
    public static ArrayList<Integer> easyAnswerCountInt=new ArrayList<>();
    public static ArrayList<Integer> middleAnswerCountInt = new ArrayList<>();
    public static ArrayList<Integer> hardAnswerCountInt = new ArrayList<>();
//
//    public static void main(String[] args) {
//        arraySort();
//        System.out.println(hardAnswerCountInt.get(1));
//    }

    public static void arraySort() {
        User user = new User();
        for (String s : arrayFile()){
            int x=s.indexOf(".");
            int x2=s.indexOf(".",s.indexOf(".",x+1)+1);
            int x3=s.indexOf(".",x2+1);
            int x4=s.indexOf(".",x3+1);
            user.setId(Integer.parseInt(s.substring(0,x)));
            user.setLogin(s.substring(x+1,s.indexOf(".",x+1)));
            user.setPassword(s.substring(s.indexOf(".",x+1)+1,x2));
            user.setEasyAnswerCount(Integer.parseInt(s.substring(x2+1,x3)));
            user.setMiddleAnswerCount(Integer.parseInt(s.substring(x3+1,x4)));
            user.setHardAnswerCount(Integer.parseInt(s.substring(x4+1,s.indexOf(";"))));
            idInt.add(user.getId());
             loginString.add(user.getLogin());
            passwordString.add(user.getPassword());
            easyAnswerCountInt.add(user.getEasyAnswerCount());
            middleAnswerCountInt.add(user.getMiddleAnswerCount());
            hardAnswerCountInt.add(user.getHardAnswerCount());
            }
    }
}
