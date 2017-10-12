package com.company;

public class Main {

  public static void main(String[] args) {
    int a = 15;
    int b = 5;
    switch (a / b) {
      case 1:
        System.out.println("Both are same!!!");
        break;
      case 2:
        System.out.println("Numerator is twice the denominator");
        break;
      case 3:
        System.out.println("Numerator is thrice the denominator");
        break;
      default:
        System.out.println("Something else! ");
    }

    char myChar = 'D';
    switch (myChar) {
      case 'A':
        System.out.println("myChar is A");
        break;
      case 'B':
        System.out.println("myChar is B");
        break;
      case 'C':
      case 'D':
      case 'E':
        System.out.println("myChar is " + myChar);
        break;
      default:
        System.out.println("No A,B,C,D or E was found");
    }

    String month = "February";
    switch (month.toLowerCase()) {
      case "january":
        System.out.println("JAN");
        break;
      case "february":
        System.out.println("FEB");
      default:
        System.out.println("Sometime February!");
    }
  }
}
