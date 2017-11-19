package com.company;

public class Main {

  public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "White");
    hamburger.itemizeHamburger();
    hamburger.addHamburgerAddition1("Tomato", .027);
    hamburger.addHamburgerAddition2("Lettuce", 0.75);
    hamburger.addHamburgerAddition3("Cheese", 1.12);
    System.out.println("Total price for " + hamburger.getName() + " hamburger is : " + hamburger
        .itemizeHamburger());

    HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 5.67);
    healthyHamburger.addHealthyAddition1("Egg", 2.32);
    healthyHamburger.addHealthyAddition2("Lentils", 3.21);
    healthyHamburger.addHamburgerAddition1("Tomato", .027);
    System.out.println(
        "Total price for " + healthyHamburger.getName() + " hamburger is : " + healthyHamburger
            .itemizeHamburger());

    DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
    deluxeHamburger.addHamburgerAddition1("Tomato", .027);
    System.out.println(
        "Total price for " + deluxeHamburger.getName() + " hamburger is : " + deluxeHamburger
            .itemizeHamburger());
  }
}
