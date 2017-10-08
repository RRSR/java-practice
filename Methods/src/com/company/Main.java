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

    displayHighScorePosition("Raj", calculateHighScorePosition(1000));
    displayHighScorePosition("Hari", calculateHighScorePosition(900));
    displayHighScorePosition("Jai", calculateHighScorePosition(100));
    displayHighScorePosition("Mohan", calculateHighScorePosition(50));

  }

  private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2000;
      return finalScore;
    }
    return 0;
  }

  private static void displayHighScorePosition(String name, int position) {
    System.out
        .println(name + " managed to get into position " + position + " on the high score table.");
  }

  private static int calculateHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score >= 500) {
      return 2;
    } else if (score >= 100) {
      return 3;
    } else {
      return 4;
    }
  }

}
