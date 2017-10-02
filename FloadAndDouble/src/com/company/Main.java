package com.company;

public class Main {

  public static void main(String[] args) {
    //width of int = 32 (4 bytes)
    int myIntValue = 5 / 2;

    //width of float = 32 (4 bytes)
    float myFloatValue = 5F / 3F;

    //width of double = 64 (8 bytes)
    double myDoubleValue = 5D / 3F;

    System.out.println("My int value = " + myIntValue);
    System.out.println("My float value = " + myFloatValue);
    System.out.println("My double value = " + myDoubleValue);

    //Challenge
    double noOfPounds = 1_245D;
    double noOfKilograms = noOfPounds * 0.45359237D;
    System.out.println("The number of kilograms = " + noOfKilograms);
  }
}
