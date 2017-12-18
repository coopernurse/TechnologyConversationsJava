package com.technologyconversations.learning.kata.solutions.tennisgame;

public class Player {

    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void winBall() {
        this.score = this.score + 1;
    }

}