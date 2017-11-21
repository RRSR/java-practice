package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static GroceryList groceryList = new GroceryList();

  public static void main(String[] args) {

    boolean quit = false;
    int choice = 0;
    printInstructions();
    while (!quit) {
      System.out.println("Enter your choice : ");
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          groceryList.printGroceryList();
          break;
        case 2:
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchForItem();
          break;
        case 6:
          processArrayList();
          break;
        case 7:
          quit = true;
          break;
      }
    }
  }

  private static void processArrayList() {
    ArrayList<String> newArrayList1 = new ArrayList<>();
    newArrayList1.addAll(groceryList.getGroceryList());
    ArrayList<String> newArrayList2 = new ArrayList<>(groceryList.getGroceryList());

    System.out.println("The new array list 1 is : "+newArrayList1.toString());
    System.out.println("The new array list 2 is : "+newArrayList2.toString());

    String[] myArray = new String[groceryList.getGroceryList().size()];
    myArray = groceryList.getGroceryList().toArray(myArray);

    System.out.println("The new array is : "+myArray.length);

  }

  private static void searchForItem() {
    System.out.println("Item to be searched :");
    String item = scanner.nextLine();
    System.out.println(groceryList.findItem(item));
    ;

  }

  private static void removeItem() {
    System.out.println("Item:");
    String item = scanner.nextLine();
    groceryList.removeGroceryItem(item);
  }

  private static void modifyItem() {
    System.out.println("Enter current item : ");
    String currentItem = scanner.nextLine();
    System.out.println("Enter new item : ");
    String newItem = scanner.nextLine();
    groceryList.modifyGroceryItem(currentItem, newItem);

  }

  private static void addItem() {
    System.out.println("Enter item : ");
    groceryList.addGroceryItem(scanner.nextLine());
  }

  private static void printInstructions() {
    System.out.println("\nPress:");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of grocery of items");
    System.out.println("\t 2 - To add item");
    System.out.println("\t 3 - To modify item.");
    System.out.println("\t 4 - To remove item");
    System.out.println("\t 5 - To search item");
    System.out.println("\t 6 - To print the copied ArrayList and Array");
    System.out.println("\t 7 - To Quit");
  }

    /*GroceryList groceryList = new GroceryList();
    groceryList.addGroceryItem("Cheese");
    groceryList.addGroceryItem("Eggs");
    groceryList.addGroceryItem("Honey");
    groceryList.printGroceryList();
    groceryList.modifyGroceryItem(1,"Brown Eggs");
    groceryList.printGroceryList();
    groceryList.removeGroceryItem(0);
    groceryList.printGroceryList();
    System.out.println(groceryList.findItem("Honey"));
    System.out.println(groceryList.findItem("Eggs"));*/

}
