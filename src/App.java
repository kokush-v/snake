import java.util.Arrays;
import packages.area;
import packages.control;
import packages.game_mechanic;
import packages.snake;

public class App {

  public static void main(String[] args) throws Exception {
    var area = new area();
    var snake = new snake();
    area.areaCreate();

    area.size[4][0] = snake.headRight;
    var moving = new game_mechanic(area);
    while (!area.lose) {
      try {
        area.gameVisualisation(area);
        area = control.ctrl(moving, area);
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println("GAME OVER");
        area.lose = true;
      }
    }
  }
}
