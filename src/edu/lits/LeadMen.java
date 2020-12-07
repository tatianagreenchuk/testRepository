package edu.lits;

public enum LeadMen {

    START("1","Leaderboard:"),
    BACK("2","Go Back");

    String menuName;
    String menuNumber;

    LeadMen(String number, String option) {
        menuNumber = number;
        menuName = option;
    }
}
