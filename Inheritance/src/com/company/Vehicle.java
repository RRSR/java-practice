package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
class Vehicle {

  private String name;
  private String color;

  private int currentVelocity;
  private int currentDirection;
  ;

  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
    this.currentDirection = 0;
    this.currentVelocity = 0;
  }

  void steer(int direction) {
    currentDirection += direction;
    System.out.println("Steering at " + currentDirection);
  }

  void move(int velocity, int direction) {
    currentVelocity += velocity;
    currentDirection += direction;
    System.out.println("Moving at " + currentVelocity + "in direction " + currentDirection);
  }

  void stop(){
    currentVelocity = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  int getCurrentVelocity() {
    return currentVelocity;
  }

  void setCurrentVelocity(int currentVelocity) {
    this.currentVelocity = currentVelocity;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public void setCurrentDirection(int currentDirection) {
    this.currentDirection = currentDirection;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", currentVelocity=" + currentVelocity +
        ", currentDirection=" + currentDirection +
        '}';
  }
}
