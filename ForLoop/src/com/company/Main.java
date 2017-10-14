package com.company;

public class Main {

  public static void main(String[] args) {
    for (int i = 8; i >= 2; i--) {
      System.out.println("The interest on 10,000 @" + i + " is :" + String
          .format("%.3f", calculateInterest(10000, i)));
    }

    int count = 0, countLimit = 1000000;
    int a = 2, b = 500000;
    long startTime = System.currentTimeMillis();
    System.out.println(
        "\nThe first " + countLimit + " Prime Numbers between " + a + " and " + b + " are :");
    for (int i = a; (i < b) && (count < countLimit); i++) {
      if (isPrime(i)) {
        System.out.println(i);
        count++;
      }
    }
    System.out.println(
        "The total time taken in milliseconds is :" + (System.currentTimeMillis() - startTime));
  }

  static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100));
  }

  static boolean isPrime(int n) {

    if (n == 1) {
      return false;
    }

    for (int i = 2; i <= (long) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;

  }


}
