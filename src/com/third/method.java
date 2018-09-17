package com.third;

public class method {
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int leveöCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (leveöCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
