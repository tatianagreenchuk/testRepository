package edu.lits;

public enum RegMenu2 {
    /*COMPLETE("1","complete registration and create account"),
    CANCEL("2", "cancel registration");*/

    COMPLETE("1","закінчити реєстрацію та створити обліковий запис"),
    CANCEL("2", "вийти з реєстрації");

    String menuName;
    String menuNumber;

    RegMenu2(String number, String option) {
        menuNumber = number;
        menuName = option;
    }
}
