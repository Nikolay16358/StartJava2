package com.startjava.lesson_2_3_4.guess;

public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        return this.number = number;
    }
}
