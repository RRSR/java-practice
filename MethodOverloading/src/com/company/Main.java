package com.company;

public class Main {

  public static void main(String[] args) {
    int score = calculateScore("Raj", 12);
    System.out.println(" with a score of " + score + ".");

    score = calculateScore(72);
    System.out.println(" with a score of " + score + ".");

    calculateScore();

    calcFeetAndInchesToCentimeters(5, 10.5);
    calcFeetAndInchesToCentimeters(157);

  }

  private static int calculateScore(String playerName, int points) {
    System.out.print(playerName + " has scored " + points + " points");
    return points * 1000;
  }

  private static int calculateScore(int points) {
    System.out.print("Unnamed player has scored " + points + " points");
    return points * 1000;
  }

  private static int calculateScore() {
    System.out.println("No player name, no score.");
    return 0;
  }

  private static void calcFeetAndInchesToCentimeters(double feet, double inches) {
    if ((feet < 0) || (inches < 0) || (inches > 12)) {
      System.out.println("Invalid feet or inches parameters.");
      return;
    }
    System.out
        .println(feet + " feet " + inches + " inches = " + ((feet * 12) + inches) * 2.54 + " cms.");
  }

  private static void calcFeetAndInchesToCentimeters(double inches) {
    if (inches >= 0) {
      int feet = (int) (inches / 12);
      inches = (inches % 12);
      calcFeetAndInchesToCentimeters(feet, inches);
    } else {
      System.out.println("Invalid inches value.");
    }
  }
}
