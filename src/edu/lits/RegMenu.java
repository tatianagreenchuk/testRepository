package edu.lits;

public enum RegMenu {

    CREATE("1","Створити новий обліковий запис"),
    BACK("2", "Повернутися до меню Авторизації"),
    COMPLETE("2", "Завершити реєстрацію"),
    CANCEL("1", "Відмінити реєстрацію");

    String menuName;
    String menuNumber;

    RegMenu(String number, String option) {
        menuNumber = number;
        menuName = option;
    }
}
