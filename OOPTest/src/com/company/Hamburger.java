package com.company;

/**
 * Created by Raj Rathore on 19-Nov-17
 */
public class Hamburger {

  private String name;
  private String meat;
  private double price;
  private String breadRollType;

  private String addition1Name;
  private double addition1Price;

  private String addition2Name;
  private double addition2Price;

  private String addition3Name;
  private double addition3Price;

  private String addition4Name;
  private double addition4Price;

  Hamburger(String name, String meat, double price, String breadRollType) {
    this.name = name;
    this.meat = meat;
    this.price = price;
    this.breadRollType = breadRollType;
  }

  void addHamburgerAddition1(String name, double price) {
    this.addition1Name = name;
    this.addition1Price = price;
  }

  void addHamburgerAddition2(String name, double price) {
    this.addition2Name = name;
    this.addition2Price = price;
  }

  void addHamburgerAddition3(String name, double price) {
    this.addition3Name = name;
    this.addition3Price = price;
  }

  public void addHamburgerAddition4(String name, double price) {
    this.addition4Name = name;
    this.addition4Price = price;
  }

  public double itemizeHamburger() {
    double hamburgerPrice = this.price;
    System.out.println(
        this.name + " hamburger with " + meat + " on a " + breadRollType + " is of price : " + price
            + ".");
    if (addition1Name != null) {
      hamburgerPrice += addition1Price;
      System.out.println("Added " + addition1Name + " addition for " + addition1Price + ".");
    }
    if (addition2Name != null) {
      hamburgerPrice += addition2Price;
      System.out.println("Added " + addition2Name + " addition for " + addition2Price + ".");
    }
    if (addition3Name != null) {
      hamburgerPrice += addition3Price;
      System.out.println("Added " + addition3Name + " addition for " + addition3Price + ".");
    }
    if (addition4Name != null) {
      hamburgerPrice += addition4Price;
      System.out.println("Added " + addition4Name + " addition for " + addition4Price + ".");
    }
    return hamburgerPrice;
  }

  public String getName() {
    return name;
  }
}
