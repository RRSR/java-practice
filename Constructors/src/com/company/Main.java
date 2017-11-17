package com.company;

public class Main {

  public static void main(String[] args) {
//    BankAccount bankAccount = new BankAccount(123,1000,"Raj Rajeshwar","raj_rajeshwar@gmail.com",1234567890);
//    bankAccount.setAccountNumber(123);
//    bankAccount.setBalance(1000);
//    bankAccount.setCustomerName("Raj Rajeshwar");
//    bankAccount.setEmail("raj_rajeshwar@gmail.com");
//    bankAccount.setPhoneNumber(1234567890);
    BankAccount bankAccount = new BankAccount();
    System.out.println(bankAccount.toString());

    bankAccount.deposit(100);
    System.out.println(bankAccount.toString());

    bankAccount.withdraw(2000);
    System.out.println(bankAccount.toString());

    bankAccount.deposit(1000);
    System.out.println(bankAccount.toString());

    bankAccount.withdraw(200);
    System.out.println(bankAccount.toString());
  }
}
