package com.company;

/**
 * Created by Raj Rathore on 25-Nov-17
 */
class Song {

  private String title;
  private double duration;

  Song(String title, double duration) {
    this.title = title;
    this.duration = duration;
  }

  String getTitle() {
    return title;
  }

}
