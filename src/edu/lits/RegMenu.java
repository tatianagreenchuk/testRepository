package edu.lits;

public enum RegMenu {
    HEADER1("<registration menu>"),
    BACK("1: go back"),
    START("2: start registration"),
    CHOOSE("choose option: "),
    PLEASE("<please enter your data>"),
    LOGIN("Login: "),
    PASSWORD("Password: "),
    REPEATE("repeat Password: "),
    HEADER2("<complete registration>"),
    COMPLETE("1: complete registration and create account"),
    CANCEL("2: cancel registration"),
    CONGRAT("Congratulations! Registration was successful"),
    CANCELED("registration has been canceled"),
    UNKNOWN("unknown option please try again");

    String menuName;

    RegMenu(String option) {
        menuName = option;
    }
}
