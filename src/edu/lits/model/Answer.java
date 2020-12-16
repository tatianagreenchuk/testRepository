package edu.lits.model;

public class Answer {
    private int number;
    private boolean correct;
    private String text;

    public Answer(String line) {
        String[] values = line.split("\\.", 3);
        number = Integer.parseInt(values[0]);
        correct = Boolean.parseBoolean(values[1]);
        text = values[2];
    }

    public int getNumber() {
        return number;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getText() {
        return text;
    }
}
