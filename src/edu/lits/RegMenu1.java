package edu.lits;

public enum RegMenu1 {
    /*BACK("1","go back"),
    START("2","start registration");*/

    BACK("1","повернутись назад"),
    START("2","почати реєстрацію");

    String menuName;
    String menuNumber;

    RegMenu1(String number, String option) {
        menuNumber = number;
        menuName = option;
    }
}
