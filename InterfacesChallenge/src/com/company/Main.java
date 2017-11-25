package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Player tim = new Player("Tim",10,15);
    System.out.println(tim);
    saveObject(tim);

    tim.setHitPoints(8);
    System.out.println(tim);
    tim.setWeapon("Strombringer");
    saveObject(tim);
    //loadObject(tim);
    System.out.println(tim);

    ISaveable werewolf =  new Monster("Werewolf",20,40);
    System.out.println("Strength = "+((Monster) werewolf).getStrength());
    System.out.println(werewolf);
    saveObject(werewolf);

  }

  static void saveObject(ISaveable objectToSave) {
    for (int i = 0; i < objectToSave.write().size(); i++) {
      System.out.println("saving " + objectToSave.write().get(i) + " to storage device.");
    }
  }

  static void loadObject(ISaveable objectToLoad) {
    ArrayList<String> values = readValues();
    objectToLoad.read(values);
  }

  private static ArrayList<String> readValues() {
    ArrayList<String> values = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int index = 0;
    System.out.println("Choose :\n 0 - Quit\n 1- Write");
    while (!quit) {
      System.out.println("Choose an option");
      int action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.println("Enter a string");
          String value = scanner.nextLine();
          values.add(index, value);
          index++;
          break;
      }
    }
    return values;
  }
}
