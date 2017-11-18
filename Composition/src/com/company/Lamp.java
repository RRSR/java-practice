package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
public class Lamp {

  private String style;
  private boolean battery;
  private int golbRating;

  public Lamp(String style, boolean battery, int golbRating) {
    this.style = style;
    this.battery = battery;
    this.golbRating = golbRating;
  }

  public String getStyle() {
    return style;
  }

  public boolean isBattery() {
    return battery;
  }

  public int getGolbRating() {
    return golbRating;
  }

  void turnOn() {
    System.out.println("Lamp -> Turning on");
  }
}
