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

    bankAccount.withdraw(1100);
    System.out.println(bankAccount.toString());

    VipCustomer vipCustomer1 = new VipCustomer();
    System.out.println(vipCustomer1.toString());

    VipCustomer vipCustomer2 = new VipCustomer("Raj",100000);
    System.out.println(vipCustomer2.toString());

    VipCustomer vipCustomer3 = new VipCustomer("Arjun",5000,"arjun@gmail.com");
    System.out.println(vipCustomer3.toString());

  }
}
