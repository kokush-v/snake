package packages;

public class food extends game_obj {

  public food(int x, int y) {
    super(x, y, body);
  }

  public static char body = '*';

  public void setFood(area ar, food fd) {
    var x = (int) (Math.random() * (9 - 1));
    var y = (int) (Math.random() * (9 - 1));
    this.curX = x;
    this.curY = y;
    ar.setElement(fd.body, x, y);
  }
}
