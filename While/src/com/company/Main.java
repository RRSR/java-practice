package com.company;

public class Main {

  public static void main(String[] args) {

    int startNumber = 5;
    int finishNumber = 20;
    int evenNumberCount = 0;
    while (startNumber <= finishNumber) {
      if (!isEvenNumber(startNumber)) {
        startNumber++;
        continue;
      }
      System.out.println("Even Number : " + startNumber);
      startNumber++;
      evenNumberCount++;
      if(evenNumberCount == 5)
        break;
    }
    System.out.println("Even number count : "+evenNumberCount);
  }

  private static boolean isEvenNumber(int number) {
    return (number % 2) == 0;
  }
}
