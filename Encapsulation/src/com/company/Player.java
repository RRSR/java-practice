package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
public class Player {

  public String name;
  public int health;
  public String weapon;

  public void loseHealth(int damage) {
    health -= damage;
    if (health <= 0) {
      System.out.println("Player knocked out.");
    }
  }

  public int healthRemaining() {
    return health;
  }
}
