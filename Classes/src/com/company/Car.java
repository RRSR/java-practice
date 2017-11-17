package com.company;

/**
 * Created by Raj Rathore on 16-Nov-17
 */
public class Car {

  private String model;
  private String color;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    if(model.equalsIgnoreCase("I10")){
      System.out.println("Model can not be I10. Try something else");
      return;
    }
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Car{" +
        "model='" + model + '\'' +
        ", color='" + color + '\'' +
        '}';
  }
}
