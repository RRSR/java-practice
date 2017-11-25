package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Raj Rathore on 25-Nov-17
 */
class Album {

  private String albumName;
  private List<Song> songs;

  Album(String albumName) {
    this.albumName = albumName;
    this.songs = new ArrayList<>();
  }

  void addToPlaylist(String songTitle, LinkedList<Song> playlist) {
    if (findSong(songTitle) != null) {
      playlist.add(findSong(songTitle));
    }
  }

  private Song findSong(String songTitle) {
    for (Song song : songs) {
      if (song.getTitle().equalsIgnoreCase(songTitle)) {
        return song;
      }
    }
    return null;
  }

  void addSong(String songName, double duration){
    if(findSong(songName)== null){
      songs.add(new Song(songName,duration));
    }
  }
}
