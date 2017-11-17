package com.company;

/**
 * Created by Raj Rathore on 17-Nov-17
 */
public class BankAccount {

  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private int phoneNumber;

  BankAccount() {
    this(0, 0.00, null, null, 0);
  }

  BankAccount(int accountNumber, double balance, String customerName, String email,
      int phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  void setEmail(String email) {
    this.email = email;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  void deposit(double amount) {
    balance += amount;
  }

  void withdraw(double amount) {
    if (balance < amount) {
      System.out.println("Insufficient balance");
    } else {
      balance -= amount;
    }
  }

  @Override
  public String toString() {
    return "BankAccount{" +
        "accountNumber=" + accountNumber +
        ", balance=" + balance +
        ", customerName='" + customerName + '\'' +
        ", email='" + email + '\'' +
        ", phoneNumber=" + phoneNumber +
        '}';
  }
}
