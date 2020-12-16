package edu.lits.model;

import java.util.ArrayList;

public class Task {
    private String author;
    private Difficulty level;
    private int number;
    private String text;
    public ArrayList<Answer> answerList;

    public Task(String line) {
        String[] values = line.split("\\.",4);
        author = values[0];
        level = Difficulty.valueOf(values[1]);
        number = Integer.parseInt(values[2]);
        text = values[3];
    }

    public String getAuthor() {
        return author;
    }

    public Difficulty getLevel() {
        return level;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }
}
