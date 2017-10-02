package com.company;

public class Main {

  public static void main(String[] args) {
    String myString = "This is a string";
    System.out.println("myString is equal to :" + myString);
    myString = myString + ",this is more !!!";
    System.out.println("myString is equal to :" + myString);
    myString = myString + "with copyright symbol 2017\u00A9";
    System.out.println("myString is equal to :" + myString);

    String numberString = "123.23";
    numberString = numberString + "100";
    System.out.println("numberString is equal to :" + numberString);

    String lastString = "10";
    System.out.println("lastString is equal to :" + lastString);
    int myInt = 20;
    lastString = lastString + myInt;
    System.out.println("lastString added with int is equal to :" + lastString);

    double myDouble = 5.23;
    lastString = lastString + myDouble;
    System.out.println("lastString added with double is equal to :" + lastString);

  }
}
