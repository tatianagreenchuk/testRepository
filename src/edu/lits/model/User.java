package edu.lits.model;

import java.util.Objects;

public class User {
    private int id;
    private String login;
    private String password;
    private int easyAnswerCount;
    private int middleAnswerCount;
    private int hardAnswerCount;

    public User() {
    }


    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", easyAnswerCount=" + easyAnswerCount +
                ", middleAnswerCount=" + middleAnswerCount +
                ", hardAnswerCount=" + hardAnswerCount +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                easyAnswerCount == user.easyAnswerCount &&
                middleAnswerCount == user.middleAnswerCount &&
                hardAnswerCount == user.hardAnswerCount &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }


    public int hashCode() {
        return Objects.hash(id, login, password, easyAnswerCount, middleAnswerCount, hardAnswerCount);
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

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEasyAnswerCount() {
        return easyAnswerCount;
    }

    public void setEasyAnswerCount(int easyAnswerCount) {
        this.easyAnswerCount = easyAnswerCount;
    }

    public int getMiddleAnswerCount() {
        return middleAnswerCount;
    }

    public void setMiddleAnswerCount(int middleAnswerCount) {
        this.middleAnswerCount = middleAnswerCount;
    }

    public int getHardAnswerCount() {
        return hardAnswerCount;
    }

    public void setHardAnswerCount(int hardAnswerCount) {
        this.hardAnswerCount = hardAnswerCount;
    }
}