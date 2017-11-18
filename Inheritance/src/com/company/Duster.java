package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
class Duster extends Car {

  private int roadServiceMonths;

  Duster(String color, int roadServiceMonths) {
    super("Duster", color, 5, 4, 5, false);
    this.roadServiceMonths = roadServiceMonths;
  }

  void accelerate(int rate) {
    int newVelocity = getCurrentVelocity() + rate;
    if (newVelocity == 0) {
      stop();
      changeGear(1);
      } else if (newVelocity > 0 && newVelocity <= 10) {
        changeGear(2);
      } else if (newVelocity > 10 && newVelocity <= 20) {
      changeGear(3);
    } else if (newVelocity > 20 && newVelocity <= 30) {
      changeGear(4);
    }else {
      changeGear(5);
    }
    setCurrentVelocity(newVelocity);
  }

  public String toString() {
    System.out.println(super.toString());
    return "Duster{" +
        "roadServiceMonths=" + roadServiceMonths +
        '}';
  }
}
