package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter any number : ");
    int number = scanner.nextInt();
    int[] integerArray = getIntegers(number);
    printArray(integerArray);
    System.out.println(Arrays.toString(sortArray(integerArray)));
  }

  private static int[] sortArray(int[] array) {
    for(int i=0;i<array.length-1;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[j] > array[i]){
          array[i] = array[j] + array[i];
          array[j] = array[i] - array[j];
          array[i] = array[i] - array[j];
        }
      }
    }
    return array;
  }

  /*private static double getAverage(int[] array) {
    double sum = 0;
    for (int value : array) {
      sum += value;
    }
    return sum / (double) array.length;
  }*/

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
