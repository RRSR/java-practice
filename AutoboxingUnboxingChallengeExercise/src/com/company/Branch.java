package com.company;

import java.util.ArrayList;

/**
 * Created by Raj Rathore on 22-Nov-17
 */
public class Branch {

  private String name;
  private ArrayList<Customer> customers;

  Branch(String name) {
    this.name = name;
    this.customers = new ArrayList<>();
  }

  ArrayList<Customer> getCustomers() {
    return customers;
  }

  String getName() {
    return name;
  }

  boolean addCustomer(Customer customer) {
    return !findCustomer(customer) && customers.add(customer);
  }

  private boolean findCustomer(Customer customer) {
    for (Customer customer1 : customers) {
      if (customer == customer1) {
        return true;
      }
    }
    return false;
  }

  Customer findCustomer(String customerName) {
    for (Customer customer : customers) {
      if (customer.getCustomerName().equalsIgnoreCase(customerName)) {
        return customer;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "Branch{" +
        "name='" + name + '\'' +
        ", customers=" + customers +
        '}';
  }
}
