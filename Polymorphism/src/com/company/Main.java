package com.company;

class Movie {

  private String name;

  Movie(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String plot() {
    return "No plot here.";
  }
}

class Jaws extends Movie {

  Jaws() {
    super("Jaws");
  }

  @Override
  public String plot() {
    return "A shark eats lot of people.";
  }
}

class IndependenceDay extends Movie {

  IndependenceDay() {
    super("Independence Day");
  }

  @Override
  public String plot() {
    return "Aliens attempt to take over planet earth.";
  }
}

class MazeRunner extends Movie {

  MazeRunner() {
    super("MazeRunner");
  }

  @Override
  public String plot() {
    return "Kids try and escape a maze.";
  }
}

class StarWars extends Movie {

  StarWars() {
    super("StarWars");
  }

  @Override
  public String plot() {
    return "Imperial forces try to take over earth.";
  }
}

class Forgetable extends Movie {

  Forgetable() {
    super("Forgetable");
  }

}

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      Movie movie = randomMovie();
      System.out
          .println("Movie#" + i + " : " + movie.getName() + "\nPlot : " + movie.plot() + ".\n");
    }
  }

  private static Movie randomMovie() {
    int randomNumber = (int) (Math.random() * 5) + 1;
    switch (randomNumber) {
      case 1:
        return new Jaws();
      case 2:
        return new IndependenceDay();
      case 3:
        return new MazeRunner();
      case 4:
        return new StarWars();
      case 5:
        return new Forgetable();
    }
    return null;
  }
}
