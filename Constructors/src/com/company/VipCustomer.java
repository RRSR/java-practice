package com.company;

/**
 * Created by Raj Rathore on 17-Nov-17
 */
public class VipCustomer {

  private String name;
  private double creditLimit;
  private String email;

  VipCustomer() {
    this("Test Customer",00.00,null);
  }

  VipCustomer(String name, double creditLimit) {
    this(name,creditLimit,null);
  }

  VipCustomer(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "VipCustomer{" +
        "name='" + name + '\'' +
        ", creditLimit=" + creditLimit +
        ", email='" + email + '\'' +
        '}';
  }
}
