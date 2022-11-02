import packages.area;
import packages.control;
import packages.food;
import packages.snake;

public class App {

  public static void main(String[] args) throws Exception {
    var ar = new area();
    ar.areaCreate();
    var snake = new snake(0, 4);
    var food = new food(4, 4);

    ar.setElement(snake.body, 0, 4);
    ar.setElement(food.body, 4, 4);
    while (!ar.lose) {
      try {
        ar.gameVisualisation(ar);
        control.ctrl(snake, ar, food);
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println("GAME OVER");
        ar.lose = true;
      }
    }
  }
}
