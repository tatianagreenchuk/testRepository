package edu.lits;

import edu.lits.model.User;

import java.util.Scanner;

import static edu.lits.model.WriterFileUser.writFileUserNewResult;
import static edu.lits.model.WriterFileUser.writerFile;

public class Registration {
    static final String EMAIL = "Ваша електронна адреса: ";
    static final String LOGIN = "Ваш новий логін: ";
    static final String PASSWORD = "Ваш новий пароль: ";
    static final String REPEAT = "Повторіть новий пароль: ";
    static final String NAME = "Ваше ім'я: ";
    static final String SURNAME = "Ваше прізвище: ";
    static final String DATE_OF_BIRTH = "Дата Вашого народження (напр. 08-02-1987): ";
    static final String COUNTRY = "Ваша країна: ";
    static final String CITY = "Ваше місто: ";


    public static void createAccount() {

        Scanner textInput = new Scanner(System.in);

        String login;

        while (true) {
            System.out.println();
            System.out.print(LOGIN);
            login = textInput.nextLine();
            if (login.length() < 2) {
                System.out.println();
                System.out.println("Логін повинен містити в собі не менше двох символів");
                continue;
            }
            if (Main.arrayLoginUser.contains(login)) {
                System.out.println();
                System.out.println("Такий логін вже існує.\n" +
                        "Спробуйте увійти в свій обліковий запис");
                writerFile.add("Такий логін вже існує,Починаємо з початку");
                continue;
            }
            break;
        }

        String password;

        while (true) {
            System.out.println();
            System.out.print(PASSWORD);
            password = textInput.nextLine();
            if (password.length() < 2) {
                System.out.println();
                System.out.println("Пароль повинен містити в собі не менше двох символів");
                continue;
            }
            break;
        }

        String passwordRepeat;

        while (true) {
            System.out.println();
            System.out.print(REPEAT);
            passwordRepeat = textInput.nextLine();
            if (!passwordRepeat.equals(password)) {
                System.out.println();
                System.out.println("Повторний пароль невірний, будь-ласка спробуйте ще раз");
                continue;
            }
            break;
        }

        String email;

        while (true) {
            System.out.println();
            System.out.print(EMAIL);
            email = textInput.nextLine();
            if ("".equals(email)) {
                System.out.println();
                System.out.println("Для створення нового облікового запису необхідно вказати свою електоронну адресу");
                continue;
            }
            break;
        }


        while (true) {
            System.out.println();
            System.out.print("Чи бажаєте ви ввести додаткову інформацію про себе? (1 - так, 0 - ні): ");
            String option = textInput.nextLine();
            switch (option) {
                case "1":
                    enterAdditionalInfo();
                    break;
                case "0":
                    break;
                default:
                    continue;
            }
            break;
        }
        newUser(login, passwordRepeat, email);
        writerFile.add("login: " + login + ", password: " + password);
    }

    //    створюєм нового юзера
    private static void newUser(String login, String passwordRepeat, String email) {

        User user = new User();
        user.setId(Main.arrayUser.size() + 1);
        user.setLogin(login);
        user.setPassword(passwordRepeat);
        user.setEmail(email);
        user.setName(name);
        user.setSurname(surname);
        user.setDateOfBirth(dateOfBirth);
        user.setCountry(country);
        user.setCity(city);
        Main.arrayUser.add(user);
        writFileUserNewResult();
        name = null;
        surname = null;
        dateOfBirth = null;
        country = null;
        city = null;
    }
// виніс змінні в поля
    private static String name;
    private static String surname;
    private static String dateOfBirth;
    private static String country;
    private static String city;

    static void enterAdditionalInfo() {
        Scanner textInput = new Scanner(System.in);

        System.out.println();
        System.out.print(NAME);
        name = textInput.nextLine();

        System.out.println();
        System.out.print(SURNAME);
        surname = textInput.nextLine();

        System.out.println();
        System.out.print(DATE_OF_BIRTH);
        dateOfBirth = textInput.nextLine();

        System.out.println();
        System.out.print(COUNTRY);
        country = textInput.nextLine();

        System.out.println();
        System.out.print(CITY);
        city = textInput.nextLine();
    }
}
