package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
public class Printer {

  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex) {
    if (tonerLevel > -1 && tonerLevel <= 100) {
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }
    this.duplex = duplex;
    this.pagesPrinted = 0;
  }

  public int addToner(int tonerAmount) {
    if (tonerAmount > -1 && tonerAmount <= 100) {
      if (this.tonerLevel + tonerAmount > 100) {
        return -1;
      }
      this.tonerLevel += tonerAmount;
      return this.tonerLevel;
    } else {
      return -1;
    }
  }

  public int pintPage(int pages) {
    if (duplex) {
      this.pagesPrinted += (pages / 2);
      System.out.println("Printing in Duplex mode.");
      return pages / 2;
    }
    this.pagesPrinted += pages;
    return pages;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }
}
