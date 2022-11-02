package packages;

import java.util.Set;

public class snake extends game_obj {

  public static char body = 'o';
  public static char body_2 = '*';

  public static char[] snake_length = {};

  public snake(int x, int y) {
    super(x, y, body);
  }

  public void moveTop(area game) {
    game.setElement(' ', curX, curY);
    game.setElement(body, curX, curY - 1);
    this.curY -= 1;
  }

  public void moveBottom(area game) {
    game.setElement(' ', curX, curY);
    game.setElement(body, curX, curY + 1);
    this.curY += 1;
  }

  public void moveRight(area game) {
    game.setElement(' ', curX, curY);
    game.setElement(body, curX + 1, curY);
    this.curX += 1;
  }

  public void moveLeft(area game) {
    game.setElement(' ', curX, curY);
    game.setElement(body, curX - 1, curY);
    this.curX -= 1;
  }

  public void catchFood(food fd, area ar) {
    if (fd.curX == this.curX && fd.curY == this.curY) {
      System.out.println("boom");
      fd.setFood(ar, fd);
    }
  }

  public void addlengh() {
    if (snake_length != null) {
      var clone = snake_length.clone();
      snake_length = new char[snake_length.length + 1];

      for (int i = 0; i < clone.length; i++) {
        snake_length[i] = clone[i];
      }

      snake_length[snake_length.length - 1] = body_2;
    } else snake_length = new char[] { body_2 };
  }
}
