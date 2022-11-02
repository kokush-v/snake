package packages;

import java.util.Scanner;

public class control {

  public static area ctrl(game_mechanic moving, area game) {
    var sc = new Scanner(System.in);
    var key = sc.next();

    switch (key) {
      case "w":
        game = moving.moveTop(game);
        return game;
      case "s":
        game = moving.moveBottom(game);
        return game;
      case "a":
        game = moving.moveLeft(game);
        return game;
      case "d":
        game = moving.moveRight(game);
        return game;
      default:
        return game;
    }
  }
}
