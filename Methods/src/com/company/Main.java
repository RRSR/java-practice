package com.company;

public class Main {

  public static void main(String[] args) {

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    int result = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your first final score is : " + result);

    gameOver = true;
    score = 10000;
    levelCompleted = 8;
    bonus = 200;
    result = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your first final score is : " + result);

  }

  static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2000;
      return finalScore;
    }
    return 0;
  }

}
