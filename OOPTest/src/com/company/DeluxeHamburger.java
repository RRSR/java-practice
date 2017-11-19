package com.company;

/**
 * Created by Raj Rathore on 19-Nov-17
 */
public class DeluxeHamburger extends Hamburger {

  public DeluxeHamburger() {
    super("Deluxe", "Sausage & Bacon", 14.54, "White");
    super.addHamburgerAddition1("Chips", 2.75);
    super.addHamburgerAddition2("Drink", 1.81);
  }

  @Override
  void addHamburgerAddition1(String name, double price) {
    System.out.println("Cannot add additional item to deluxe burger.");
  }

  @Override
  void addHamburgerAddition2(String name, double price) {
    System.out.println("Cannot add additional item to deluxe burger.");
  }

  @Override
  void addHamburgerAddition3(String name, double price) {
    System.out.println("Cannot add additional item to deluxe burger.");
  }

  @Override
  public void addHamburgerAddition4(String name, double price) {
    System.out.println("Cannot add additional item to deluxe burger.");
  }
}
