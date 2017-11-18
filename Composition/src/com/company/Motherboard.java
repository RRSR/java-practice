package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
class Motherboard {

  private String model;
  private String manufacturer;
  private int ramSlots;
  private int cardSlots;
  private String bios;


  Motherboard(String model, String manufacturer, int ramSlots, int cardSlots,
      String bios) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
    this.bios = bios;
  }

  void loadProgram(String programName) {
    System.out.println("Program " + programName + " is now loading...");
  }

}
