package com.company;

import java.util.ArrayList;

/**
 * Created by Raj Rathore on 22-Nov-17
 */
public class Customer {

  private String customerName;
  private ArrayList<Double> transactions;

  Customer(String customerName) {
    this.customerName = customerName;
    this.transactions = new ArrayList<>();
  }

  String getCustomerName() {
    return customerName;
  }

  boolean addTransaction(Double transaction) {
    return this.transactions.add(transaction);
  }

  @Override
  public String toString() {
    return "Customer{" +
        "customerName='" + customerName + '\'' +
        ", transactions=" + transactions +
        '}';
  }
}
