package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Raj Rathore on 25-Nov-17
 */
class Album {

  private String albumName;
  private SongList songList;

  Album(String albumName) {
    this.albumName = albumName;
    this.songList = new SongList();
  }

  void addToPlaylist(String songTitle, LinkedList<Song> playlist) {
    if (songList.findSong(songTitle) != null) {
      playlist.add(songList.findSong(songTitle));
    }
  }

  void addSong(String songName, double duration) {
    songList.addSong(songName, duration);
  }

  private class SongList {

    private List<Song> songs;

    SongList() {
      this.songs = new ArrayList<>();
    }

    void addSong(String songName, double duration) {
      if (findSong(songName) == null) {
        songs.add(new Song(songName, duration));
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
  }
}
