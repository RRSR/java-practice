package com.company;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal("Animal", 1, 1, 5, 5);
    animal.eat();

    Dog dog = new Dog("Yorkie", 7, 3, 2, 4, 1, 20, "long silky");
    dog.eat();

    dog.run();
    dog.walk();

  }
}
