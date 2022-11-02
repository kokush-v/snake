package packages;

import java.util.stream.IntStream;

public class game_mechanic {

  public static int curX;
  public static int curY = 0;

  public game_mechanic(area game) {
    curX =
      IntStream
        .range(0, game.size.length)
        .filter(i -> snake.headRight == game.size[i][0])
        .findFirst()
        .orElse(-1);
    curY =
      IntStream
        .range(0, game.size.length)
        .filter(i -> snake.headRight == game.size[curX][i])
        .findFirst()
        .orElse(-1);
  }

  public area moveLeft(area game) {
    game.size[curX][curY] = ' ';
    game.size[curX][curY - 1] = snake.headLeft;
    curY -= 1;
    return game;
  }

  public area moveRight(area game) {
    game.size[curX][curY] = ' ';
    game.size[curX][curY + 1] = snake.headRight;
    curY += 1;
    return game;
  }

  public area moveBottom(area game) {
    game.size[curX][curY] = ' ';
    game.size[curX + 1][curY] = snake.headBottom;
    curX += 1;
    return game;
  }

  public area moveTop(area game) {
    game.size[curX][curY] = ' ';
    game.size[curX - 1][curY] = snake.headTop;
    curX -= 1;
    return game;
  }
}
