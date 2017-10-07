package com.company;

public class Main {

  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    if (score <= 500 && score > 100) {
      System.out.println("Score is between 100 and 500");
    } else if (score > 500 && score < 1000) {
      System.out.println("Score is between 501 and 1000");
    } else {
      System.out.println("Score is greater than 1000.");
    }

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Your first final score is : " + finalScore);
    }

    //Print out a second score on the screen with the following :
    //score set to 10000
    //levelCompleted to 8
    //bonus set to 200
    //And the first print out still displays
    
    score = 10000;
    levelCompleted = 8;
    bonus = 200;
    int finalScore = score + (levelCompleted * bonus);
    System.out.println("Your second final score is : " + finalScore);


  }
}
