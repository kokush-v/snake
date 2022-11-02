package packages;

import java.util.Scanner;

public class control {

  public static void ctrl(snake obj, area game, food food) {
    var sc = new Scanner(System.in);
    var key = sc.nextLine().charAt(0);

    switch (key) {
      case 'w':
        obj.moveTop(game);
        obj.catchFood(food, game);
        break;
      case 's':
        obj.catchFood(food, game);
        obj.moveBottom(game);
        break;
      case 'a':
        obj.catchFood(food, game);
        obj.moveLeft(game);
        break;
      case 'd':
        obj.catchFood(food, game);
        obj.moveRight(game);
        break;
      default:
        break;
    }
  }
}
