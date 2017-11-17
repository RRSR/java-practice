package com.company;

public class Main {

  public static void main(String[] args) {
    Car car = new Car();
    car.setModel("I10");
    System.out.println(car.toString());
    car.setModel("I20");
    System.out.println(car.toString());
  }
}
