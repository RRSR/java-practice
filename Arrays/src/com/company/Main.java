package com.company;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter any number : ");
    int number = scanner.nextInt();
    int[] integerArray = getIntegers(number);
    printArray(integerArray);
    System.out.println(getAverage(integerArray));
  }

  private static double getAverage(int[] array) {
    double sum = 0;
    for (int value : array) {
      sum += value;
    }
    return sum / (double) array.length;
  }

  private static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values");
    int[] array = new int[number];
    for (int i = 0; i < number; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + ", value " + array[i]);
    }
  }
}
