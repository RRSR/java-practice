package com.company;

import java.util.Scanner;

public class Main {

  private static Bank bank = new Bank("Bank of India");

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("\n\t\t$$$$$ Welcome to " + bank.getName() + " $$$$$");
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
          addBranch();
          break;
        case 2:
          addCustomer();
          break;
        case 3:
          addTransaction();
          break;
        case 4:
          showCustomers();
          break;
        case 5:
          quit = true;
          break;
      }
    }
  }

  private static void printInstructions() {
    System.out.println("\nPress:");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To add a new branch");
    System.out.println("\t 2 - To add a new customer");
    System.out.println("\t 3 - To a transaction to a customer");
    System.out.println("\t 4 - To show customers of a branch");
    System.out.println("\t 5 - To Quit");
  }

  private static void addBranch() {
    System.out.println("Enter branch name :");
    String name = scanner.nextLine();
    if (bank.addBranch(new Branch(name))) {
      System.out.println("Added branch " + name);
    } else {
      System.out.println("Branch " + name + " already exists!");
    }
  }

  private static void addCustomer() {
    System.out.println("Enter branch name :");
    String branchName = scanner.nextLine();
    if (bank.findBranch(branchName) != null) {
      Branch branch = bank.findBranch(branchName);
      System.out.println("Enter customer name :");
      String customerName = scanner.nextLine();
      if (branch.addCustomer(new Customer(customerName))) {
        System.out.println("Added " + customerName + " to " + branchName + ".");
      } else {
        System.out.println(customerName + " already exists!");
      }
    } else {
      System.out.println("Branch " + branchName + " does not exists!");
    }
  }

  private static void addTransaction() {
    System.out.println("Enter branch name :");
    String branchName = scanner.nextLine();
    if (bank.findBranch(branchName) != null) {
      Branch branch = bank.findBranch(branchName);System.out.println("Enter customer name :");
      String customerName = scanner.nextLine();
      Customer customer = branch.findCustomer(customerName);
      if (customer != null) {
        System.out.println("Enter transaction amount :");
        double amount = scanner.nextDouble();
        customer.addTransaction(amount);
      } else {
        System.out.println("Customer " + customerName + " does not exists!");
      }
    } else {
      System.out.println("Branch " + branchName + " does not exists!");
    }
  }

  private static void showCustomers() {
    System.out.println("Enter branch name :");
    String name = scanner.nextLine();
    if (bank.findBranch(name) != null) {
      System.out.println(bank.findBranch(name).getCustomers());
    }else {
      System.out.println("Branch "+name+" does not exists!");
    }
  }

}
