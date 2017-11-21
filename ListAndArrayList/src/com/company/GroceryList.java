package com.company;

import java.util.ArrayList;

/**
 * Created by Raj Rathore on 19-Nov-17
 */
class GroceryList {

  private ArrayList<String> groceryList = new ArrayList<>();

  void addGroceryItem(String item) {
    groceryList.add(item);
    System.out.println("Item " + item + " is added at position " + (groceryList.indexOf(item) + 1));
  }

  void printGroceryList() {
    System.out.println(groceryList);
  }

  void modifyGroceryItem(String currentItem, String newItem) {
    if (groceryList.indexOf(currentItem) < 0) {
      System.out.println("Item " + currentItem + " not found.");
      return;
    }
    groceryList.set(groceryList.indexOf(currentItem), newItem);
    System.out.println("Grocery item " + currentItem + " has been modified to " + newItem + ".");
  }

  void removeGroceryItem(String item) {
    if (groceryList.indexOf(item) < 0) {
      System.out.println("Item " + item + " not found.");
      return;
    }
    groceryList.remove(groceryList.get(groceryList.indexOf(item)));
    System.out.println("Grocery item " + item + " has been removed.");
  }

  String findItem(String item) {
    return groceryList.contains(item) ? "Found item " + groceryList.get(groceryList.indexOf(item))
        : "Not found " + item + "!";
  }

  public ArrayList<String> getGroceryList() {
    return groceryList;
  }
}
