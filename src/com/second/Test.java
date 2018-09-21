package com.second;

public class Test {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Punkte oli vähem kui 5000 aga rohkem kui 1000");
        } else if (score < 1000) {
            System.out.println("Punkte oli vähem kui 1000");
        } else {
            System.out.println("See on lõpp");
        }

        if(gameOver == true) { // võrdväärne oleks ka if(gameOver)
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Sinu punktide summa on: " + finalScore);
        }
    }
}