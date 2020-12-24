package edu.lits.model;

public class Answer {
    private int number;
    private byte correct;
    private String text;

    public Answer() {
    }

    public Answer(String line) {
        String[] values = line.split("\\.", 3);
        number = Integer.parseInt(values[0]);
        correct = Byte.parseByte(values[1]);
        text = values[2];
    }

    public int getNumber() {
        return number;
    }

    public byte isCorrect() {
        return correct;
    }

    public String getText() {
        return text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCorrect(byte correct) {
        this.correct = correct;
    }

    public void setText(String text) {
        this.text = text;
    }
}
