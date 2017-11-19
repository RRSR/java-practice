package com.company;

/**
 * Created by Raj Rathore on 19-Nov-17
 */
public class HealthyHamburger extends Hamburger {

  private String healthyAddition1Name;
  private double healthyAddition1Price;

  private String healthyAddition2Name;
  private double healthyAddition2Price;


  HealthyHamburger(String meat, double price) {
    super("Healthy", meat, price, "Brown Rye");
  }

  public void addHealthyAddition1(String name, double price) {
    healthyAddition1Name = name;
    healthyAddition1Price = price;
  }

  public void addHealthyAddition2(String name, double price) {
    healthyAddition2Name = name;
    healthyAddition2Price = price;
  }

  @Override
  public double itemizeHamburger() {
    double hamburgerPrice = super.itemizeHamburger();
    if (healthyAddition1Name != null) {
      hamburgerPrice += healthyAddition1Price;
      System.out.println(
          "Added healthy addition " + healthyAddition1Name + " for " + healthyAddition1Price + ".");
    }
    if (healthyAddition2Name != null) {
      hamburgerPrice += healthyAddition2Price;
      System.out.println(
          "Added healthy addition " + healthyAddition2Name + " for " + healthyAddition2Price + ".");
    }
    return hamburgerPrice;
  }
}
