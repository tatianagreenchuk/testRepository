package edu.lits.UserArrayFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ArrayFileUser {


    public static ArrayList<String> arrayUserName=new ArrayList<>();
        //public static void main(String[] args) {

            //  userUser();

    //   }

        public static void userUser() {
            User user=new User();
            for(String s: arreyLigstFile()){
                int x=s.indexOf(".");
                user.setNumberUser(Integer.parseInt (s.substring(0,x)));
                user.setNameUser(s.substring(x+1,s.indexOf(".",x+1)));
                user.setPasswordUser(s.substring(s.indexOf(".",x+1)+1));
                arrayUserName.add(user.getNameUser());
            }
        }

        public static List<String> arreyLigstFile() {
            String userFile="User.txt";

            List<String>result=new ArrayList<>();
            try {
                result= Files.readAllLines(Path.of(userFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  result;
        }


   }

