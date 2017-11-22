package com.company;

import java.util.Scanner;

public class Main {

  private static MobilePhone mobilePhone = new MobilePhone();
  private static Scanner scanner = new Scanner(System.in);

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
          printContactList();
          break;
        case 2:
          addContact();
          break;
        case 3:
          updateContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          findContact();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  private static void findContact() {
    System.out.println("Enter contact name :");
    String name = scanner.nextLine();
    Contact contact = mobilePhone.findContact(name);
    if (contact != null)
      System.out.println(contact.toString());
    else {
      System.out.println("Contact does not exist!");
    }

  }

  private static void removeContact() {
    System.out.println("Enter contact name :");
    String name = scanner.nextLine();
    if (mobilePhone.findContact(name) != null)
      mobilePhone.removeContact(mobilePhone.findContact(name));
    else {
      System.out.println("Contact does not exist!");
    }
  }

  private static void updateContact() {
    System.out.println("Enter current contact name :");
    String currentName = scanner.nextLine();
    System.out.println("Enter new contact name :");
    String newName = scanner.nextLine();
    Contact oldContact = mobilePhone.findContact(currentName);
    if (oldContact != null) {
      Contact newContact = new Contact(newName, oldContact.getNumber());
      mobilePhone.updateContact(oldContact, newContact);
    } else {
      System.out.println("No contact with name " + currentName + " found!");
    }

  }

  private static void addContact() {
    System.out.println("Enter contact name :");
    String name = scanner.nextLine();
    System.out.println("Enter contact number");
    int number = scanner.nextInt();
    mobilePhone.addContact(new Contact(name, number));
  }

  private static void printContactList() {
    mobilePhone.printContacts();
  }

  private static void printInstructions() {
    System.out.println("\nPress:");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of all the contacts");
    System.out.println("\t 2 - To add contact");
    System.out.println("\t 3 - To modify contact.");
    System.out.println("\t 4 - To remove contact");
    System.out.println("\t 5 - To search contact");
    System.out.println("\t 6 - To Quit");
  }
}
