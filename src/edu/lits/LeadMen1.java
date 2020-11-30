package edu.lits;

public enum LeadMen1 {
    BACK("1","Go Back"),
    START("2","Leaderboard:");




    String menuName;
    String menuNumber;

    LeadMen1(String number, String option) {
        menuNumber = number;
        menuName = option;
    }
}
