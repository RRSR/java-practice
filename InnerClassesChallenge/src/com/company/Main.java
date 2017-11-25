package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

  private static ArrayList<Album> albums = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    Album album = new Album("Rock");
    album.addSong("Rock On", 3.5);
    album.addSong("Kasam paida karne wale ki", 6);
    album.addSong("Disco 82", 4.6);
    album.addSong("Hookah bar", 4.2);
    album.addSong("Shimmi shimmi", 5.1);
    albums.add(album);

    album = new Album("Aaarti");
    album.addSong("Ganesh Ji", 6.3);
    album.addSong("Shiv Ji", 4.5);
    album.addSong("Hanuman Ji", 4.6);
    album.addSong("Kirshna JI", 4.5);
    album.addSong("Saraswati Ji", 6.22);
    albums.add(album);

    LinkedList<Song> playlist = new LinkedList<>();
    albums.get(0).addToPlaylist("Rock On", playlist);
    albums.get(0).addToPlaylist("Disco 82", playlist);
    albums.get(0).addToPlaylist("Hookah bar", playlist);
    albums.get(1).addToPlaylist("Saraswati Ji", playlist);
    albums.get(1).addToPlaylist("Shiv Ji", playlist);
    albums.get(1).addToPlaylist("Kal ho na ho", playlist);

    play(playlist);
  }

  private static void play(LinkedList<Song> playlist) {
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<Song> songListIterator = playlist.listIterator();
    if (playlist.size() == 0) {
      System.out.println("Playlist is empty!");
      return;
    } else {
      System.out.println("Now playing " + songListIterator.next().getTitle());
      printMenu();
    }

    while (!quit) {
      System.out.println("Your choice : ");
      int action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0:
          System.out.println("Playlist complete.");
          quit = true;
          break;
        case 1:
          if (!goingForward) {
            if (songListIterator.hasNext()) {
              songListIterator.next();
            }
            goingForward = true;
          }
          if (songListIterator.hasNext()) {
            System.out.println("Now playing " + songListIterator.next().getTitle());
          } else {
            System.out.println("Reached end of the playlist.");
            goingForward = false;
          }
          break;
        case 2:
          if (goingForward) {
            if (songListIterator.hasPrevious()) {
              songListIterator.previous();
            }
            goingForward = false;
          }
          if (songListIterator.hasPrevious()) {
            System.out.println("Now playing " + songListIterator.previous().getTitle());
          } else {
            System.out.println("Reached start of the playlist.");
            goingForward = true;
          }
          break;
        case 3:
          if (goingForward) {
            if (songListIterator.hasPrevious()) {
              System.out.println("Now replaying " + songListIterator.previous().getTitle());
              goingForward = false;
            } else {
              System.out.println("Reached start of the playlist.");
            }
          } else {
            if (songListIterator.hasNext()) {
              System.out.println("Now replaying " + songListIterator.next().getTitle());
              goingForward = true;
            } else {
              System.out.println("Reached end of the playlist.");
            }
          }
          break;
        case 4:
          printPlaylist(playlist);
          break;
        case 5:
        default:
          printMenu();
          break;
        case 6:
          if (playlist.size() > 0) {
            if ((goingForward && !songListIterator.hasPrevious()) || (!goingForward
                && !songListIterator.hasNext())) {
              System.out.println("Play something to delete first !");
              break;
            }
            songListIterator.remove();
            System.out.println("Removed the current song.");
            if (songListIterator.hasNext()) {
              System.out.println("Now playing :" + songListIterator.next().getTitle());
              goingForward = true;
            } else if (songListIterator.hasPrevious()) {
              System.out.println("Now playing :" + songListIterator.previous().getTitle());
              goingForward = false;
            }
          } else {
            System.out.println("Playlist is empty. Nothing to delete.");
          }
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("Available actions:\nPress");
    System.out.println(
        "0  - Quit\n1 - Next Song\n2 - Previous Song\n3 - Replay Song\n4 - Show Playlist\n5 - Show Menu\n6 - Remove current song");
  }

  private static void printPlaylist(LinkedList<Song> playlist) {
    if(playlist.size() == 0){
      System.out.println("Playlist is empty.");
      return;
    }
    System.out.println("Your playlist :");
    for (Song song : playlist) {
      System.out.println("# " + song.getTitle());
    }
  }
}
