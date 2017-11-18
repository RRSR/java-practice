package com.company;

public class Main {

  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case aCase = new Case("220B", "Dell", "240", dimensions);
    Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
    Motherboard motherboard = new Motherboard("BT-200", "Asus", 4, 6, "v2.54");
    PC pc = new PC(aCase, monitor, motherboard);
    pc.powerUp();

    Wall wall1 = new Wall("EAST");
    Wall wall2 = new Wall("WEST");
    Wall wall3 = new Wall("NORTH");
    Wall wall4 = new Wall("SOUTH");

    Ceiling ceiling = new Ceiling(12, "Red");

    Bed bed = new Bed("Modern", 4, 3, 2, 1);

    Lamp lamp = new Lamp("Classis", false, 75);

    Bedroom bedroom = new Bedroom("Raj's Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

    bedroom.makeBed();
    bedroom.getLamp().turnOn();
  }
}
