package com.company;

/**
 * Created by Raj Rathore on 18-Nov-17
 */
class PC {

  private Case theCase;
  private Monitor monitor;
  private Motherboard motherboard;

  PC(Case theCase, Monitor monitor, Motherboard motherboard) {
    this.theCase = theCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  void powerUp() {
    theCase.pressPowerButton();
    drawLogo();
  }

  private void drawLogo() {
    monitor.drawPixelAt(1200, 300, "Yellow");
  }
}
