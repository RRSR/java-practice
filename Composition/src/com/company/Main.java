package com.company;

public class Main {

  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case aCase = new Case("220B", "Dell", "240", dimensions);
    Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
    Motherboard motherboard = new Motherboard("BT-200", "Asus", 4, 6, "v2.54");
    PC pc = new PC(aCase, monitor,motherboard);
    pc.getMonitor().drawPixelAt(13,12,"Red");
    pc.getMotherboard().loadProgram("VLC Player");
    pc.getTheCase().pressPowerButton();
  }
}
