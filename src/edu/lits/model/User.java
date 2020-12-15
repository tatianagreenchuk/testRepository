package edu.lits.model;

import java.util.Objects;

//10,gennadii,00000,6,7,8,gennadii,petrov,9-10-1985,genchik@gmail.com,ukraine,vinnytsia
public class User {
    private int id;
    private String login;
    private String password;
    private int easyAnswerCount;
    private int middleAnswerCount;
    private int hardAnswerCount;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String email;
    private String country;
    private String city;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getEasyAnswerCount() {
        return easyAnswerCount;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMiddleAnswerCount() {
        return middleAnswerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHardAnswerCount() {
        return hardAnswerCount;
    }

    public void setHardAnswerCount(int hardAnswerCount) {
        this.hardAnswerCount = hardAnswerCount;
    }

    public void setMiddleAnswerCount(int middleAnswerCount) {
        this.middleAnswerCount = middleAnswerCount;
    }

    public void setEasyAnswerCount(int easyAnswerCount) {
        this.easyAnswerCount = easyAnswerCount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                easyAnswerCount == user.easyAnswerCount &&
                middleAnswerCount == user.middleAnswerCount &&
                hardAnswerCount == user.hardAnswerCount &&
                login.equals(user.login) &&
                password.equals(user.password) &&
                name.equals(user.name) &&
                surname.equals(user.surname) &&
                dateOfBirth.equals(user.dateOfBirth) &&
                email.equals(user.email) &&
                country.equals(user.country) &&
                city.equals(user.city);
    }

    public int hashCode() {
        return Objects.hash(id, login, password, easyAnswerCount, middleAnswerCount, hardAnswerCount, name, surname, dateOfBirth, email, country, city);
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", easyAnswerCount=" + easyAnswerCount +
                ", middleAnswerCount=" + middleAnswerCount +
                ", hardAnswerCount=" + hardAnswerCount +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}