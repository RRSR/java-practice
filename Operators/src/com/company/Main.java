package com.company;

public class Main {

  public static void main(String[] args) {
    int result = 1 + 2;
    System.out.println("1 + 2 =" + result);

    int previousResult = result;
    result = result - 1;
    System.out.println(previousResult + " - 1 = " + result);

    previousResult = result;
    result = result * 50;
    System.out.println(previousResult + " * 50 = " + result);

    previousResult = result;
    result = result / 5;
    System.out.println(previousResult + " / 5 = " + result);

    previousResult = result;
    result = result % 3;
    System.out.println(previousResult + " % 3 = " + result);

    previousResult = result;
    result++;
    System.out.println(previousResult + "++ = " + result);

    previousResult = result;
    result--;
    System.out.println(previousResult + "-- = " + result);

    previousResult = result;
    result += 7;
    System.out.println(previousResult + " += 7 => " + result);

    previousResult = result;
    result -= 3;
    System.out.println(previousResult + " -= 3 => " + result);

    previousResult = result;
    result += 7;
    System.out.println(previousResult + " += 7 => " + result);

    previousResult = result;
    result *= 12;
    System.out.println(previousResult + " *= 12 => " + result);

    previousResult = result;
    result /= 5;
    System.out.println(previousResult + " /= 5 => " + result);

    previousResult = result;
    result %= 3;
    System.out.println(previousResult + " %= 3 => " + result);

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println("It's not an Alien guys!!!");
    }

    int topScore = 80;
    if (topScore < 100) {
      System.out.println(topScore + " < 100");
    }

    int secondTopScore = 60;
    if (secondTopScore < topScore && topScore < 100) {
      System.out.println(secondTopScore + " < " + topScore + " and " + topScore + " < 100");
    }


  }
}
