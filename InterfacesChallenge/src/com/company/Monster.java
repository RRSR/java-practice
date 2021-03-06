package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raj Rathore on 25-Nov-17
 */
public class Monster implements ISaveable {

  private String name;
  private int hitPoints;
  private int strength;

  Monster(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
  }

  public String getName() {
    return name;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  int getStrength() {
    return strength;
  }

  @Override
  public String toString() {
    return "Monster{" +
        "name='" + name + '\'' +
        ", hitPoints=" + hitPoints +
        ", strength=" + strength +
        '}';
  }

  @Override
  public List<String> write() {
    List<String> values = new ArrayList<>();
    values.add(0, name);
    values.add(1, "" + hitPoints);
    values.add(2, "" + strength);
    return values;
  }

  @Override
  public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0) {
      name = savedValues.get(0);
      hitPoints = Integer.parseInt(savedValues.get(1));
      strength = Integer.parseInt(savedValues.get(2));
    }
  }
}
