package com.company;

class Car {

  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  Car(int cylinders, String name) {
    this.engine = true;
    this.cylinders = cylinders;
    this.name = name;
    this.wheels = 4;
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }

  public String startEngine() {
    return "Car -> Engine started.";
  }

  public String accelerate() {
    return "Car -> Accelerate.";
  }

  public String brake() {
    return "Car -> Brake.";
  }
}

class Mitsubishi extends Car {

  Mitsubishi(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> Start engine.";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " -> Accelerate.";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName() + " -> Brake";
  }
}

class Audi extends Car {

  Audi(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> Start engine.";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " -> Accelerate.";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName() + " -> Brake";
  }
}

class Ford extends Car {

  Ford(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> Start engine.";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " -> Accelerate.";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName() + " -> Brake";
  }
}

public class Main {

  public static void main(String[] args) {
    Car car = new Car(8, "Base Car");
    System.out.println(car.accelerate());
    System.out.println(car.brake());
    System.out.println(car.startEngine());

    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());
    System.out.println(mitsubishi.startEngine());

    Ford ford = new Ford(4, "Ford Fiesta");
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());
    System.out.println(ford.startEngine());

    Audi audi = new Audi(6, "A3");
    System.out.println(audi.accelerate());
    System.out.println(audi.brake());
    System.out.println(audi.startEngine());

  }
}
