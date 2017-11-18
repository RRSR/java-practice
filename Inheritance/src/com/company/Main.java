package com.company;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal("Animal", 1, 1, 5, 5);
    animal.eat();

    Dog dog = new Dog("Yorkie", 7, 3, 2, 4, 1, 20, "long silky");
    dog.eat();

    dog.run();
    dog.walk();


    Duster duster = new Duster("Brown",36);
    System.out.println(duster.toString());
    duster.accelerate(13);
    System.out.println(duster.toString());
    duster.accelerate(-6);
    System.out.println(duster.toString());
    duster.steer(45);
    System.out.println(duster.toString());

  }
}
