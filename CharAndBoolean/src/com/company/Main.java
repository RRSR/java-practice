package com.company;

public class Main {

  public static void main(String[] args) {

    //width of 16 (2 bytes)
    char myChar = '\u2744';
    System.out.println("The snowflake symbol looks like : " + myChar);

    boolean myBoolean = false;

    //Challenge
    char charValue = '\u00AE';
    System.out.println("The Registered symbol looks like : " + charValue);
  }
}
