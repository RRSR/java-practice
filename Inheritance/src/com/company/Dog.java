package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
class Dog extends Animal {

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth,
      String coat) {
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  private void chew() {
    System.out.println("Dog Chewing");
  }

  @Override
  public void eat() {
    chew();
    super.eat();
  }

  void walk() {
    System.out.println("Walking");
    move(5);
  }

  void run() {
    System.out.println("Running");
    super.move(10);
  }

  void moveLegs(){
    System.out.println("Moving legs");
  }

  @Override
  public void move(int speed) {
    moveLegs();
    super.move(speed);
  }
}
