package com.company;

public class Main {

  public static void main(String[] args) {
   /* Player player = new Player();
    player.name = "Raj";
    player.health = 30;
    player.weapon = "Sword";

    player.loseHealth(20);
    player.health = 80;
    System.out.println("Remaining health : " + player.healthRemaining());

    player.loseHealth(20);
    System.out.println("Remaining health : " + player.healthRemaining());*/


    EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Jai",200,"Sword");
    System.out.println("Initial health is "+enhancedPlayer.getHealth());
  }
}
