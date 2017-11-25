package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<>();
    addInOrder(placesToVisit, "New York");
    addInOrder(placesToVisit, "Paris");
    addInOrder(placesToVisit, "Hong Kong");
    addInOrder(placesToVisit, "Ladakh");
    addInOrder(placesToVisit, "Moscow");
    addInOrder(placesToVisit, "Australia");
    addInOrder(placesToVisit, "Moscow");
    addInOrder(placesToVisit, "Germany");
    printList(placesToVisit);
    /*ListIterator listIterator = placesToVisit.listIterator();
    System.out.println(listIterator.next());
    System.out.println(listIterator.next());
    System.out.println(listIterator.previous());
    System.out.println(listIterator.previous());*/
    visit(placesToVisit);

  }

  private static void printList(LinkedList<String> placesToVisit) {
    Iterator<String> i = placesToVisit.iterator();
    while (i.hasNext()) {
      System.out.println("Now visiting : " + i.next());
    }
    System.out.println("===========================");
  }

  private static void addInOrder(LinkedList<String> linkedList, String newCity) {
    ListIterator<String> listIterator = linkedList.listIterator();
    while (listIterator.hasNext()) {
      int comparision = listIterator.next().compareTo(newCity);
      if (comparision == 0) {
        System.out.println(newCity + " is already included in the list!");
        return;
      } else if (comparision > 0) {
        listIterator.previous();
        listIterator.add(newCity);
        return;
      }
    }
    //listIterator.add(newCity);
    linkedList.add(newCity);
  }

  private static void visit(LinkedList<String> cities) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<String> listIterator = cities.listIterator();
    if (cities.isEmpty()) {
      System.out.println("No cities in the itinerary!");
      return;
    } else {
      System.out.println("Now visiting " + listIterator.hasNext());
      printMenu();
    }

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0:
          System.out.println("Vacations over!");
          quit = true;
          break;
        case 1:
          if (!goingForward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            goingForward = true;
          }
          if (listIterator.hasNext()) {
            System.out.println("Now visiting " + listIterator.next());
          } else {
            System.out.println("Reached end of the list.");
          }
          break;
        case 2:
          if (goingForward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingForward = false;
          }
          if (listIterator.hasPrevious()) {
            System.out.println("Now visiting " + listIterator.previous());
          } else {
            System.out.println("We are at the start of the list.");
          }
          break;
        case 3:
        default:
          printMenu();
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("Available actions:\nPress");
    System.out.println("0  - Quit\n1 - Next City\n2 - Previous City\n3 - Menu");
  }
}
