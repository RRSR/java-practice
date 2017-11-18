package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
class Case {

  private String model;
  private String manufacturer;
  private String powerSupply;
  private Dimensions dimensions;

  Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.powerSupply = powerSupply;
    this.dimensions = dimensions;
  }

  void pressPowerButton() {
    System.out.println("Power button pressed.");
  }
}
