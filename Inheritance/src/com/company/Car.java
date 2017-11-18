package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
public class Car extends Vehicle {

  private int wheels;
  private int doors;
  private int gears;
  private boolean isManual;
  private int currentGear;

  Car(String name, String color, int wheels, int doors, int gears, boolean isManual) {
    super(name, color);
    this.wheels = wheels;
    this.doors = doors;
    this.gears = gears;
    this.isManual = isManual;
    this.currentGear = 1;
  }

  void changeGear(int gear) {
    currentGear = gear;
    System.out.println("Gear changed to " + currentGear);
  }


  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public int getGears() {
    return gears;
  }

  public void setGears(int gears) {
    this.gears = gears;
  }

  public boolean isManual() {
    return isManual;
  }

  public void setManual(boolean manual) {
    isManual = manual;
  }

  public int getCurrentGear() {
    return currentGear;
  }

  public void setCurrentGear(int currentGear) {
    this.currentGear = currentGear;
  }

  public String toString() {
    System.out.println(super.toString());
    return "Car{" +
        "wheels=" + wheels +
        ", doors=" + doors +
        ", gears=" + gears +
        ", isManual=" + isManual +
        ", currentGear=" + currentGear +
        '}';
  }
}
