package com.company;

/**
 * Created by Raj Rathore on 21-Nov-17
 */
public class Contact {

  private String name;
  private int number;

  Contact(String name, int number) {
    this.name = name;
    this.number = number;
  }

  String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Contact{" +
        "name='" + name + '\'' +
        ", number=" + number +
        '}';
  }
}
