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

    //Writing my name in hindi
    char char1= '\u0930';
    char char2= '\u093e';
    char char3= '\u091c';
    char char4= '\u0947';
    char char5= '\u0936';
    char char6= '\u094d';
    char char7= '\u0935';
    System.out.println("My name is : "+char1+char2+char3+" "+char1+char2+char3+char4+char5+char6+char7+char1);

  }
}
