package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
class Animal {

  private String name;
  private int brain;
  private int body;
  private int size;
  private int weight;

  Animal(String name, int brain, int body, int size, int weight) {
    this.name = name;
    this.brain = brain;
    this.body = body;
    this.size = size;
    this.weight = weight;
  }

  public void eat() {
    System.out.println("Eating");
  }

  public void move(int speed) {
    System.out.println("Moving at a speed of " + speed);
  }
}
