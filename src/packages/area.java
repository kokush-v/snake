package packages;

import java.util.Arrays;

public class area {

  public char[][] size = new char[9][9];
  public boolean lose = false;

  public void areaCreate() {
    for (int i = 0; i < size.length; i++) {
      size[i][0] = ' ';
      for (int j = 0; j < size[0].length; j++) {
        size[i][j] = ' ';
      }
    }
  }

  public void setElement(char b, int x, int y) {
    this.size[y][x] = b;
  }

  public void gameVisualisation(area ar) {
    System.out.println("\n\n\n\n");

    for (int x = 0; x < size.length; x++) System.out.println(
      Arrays.toString(ar.size[x])
    );

    System.out.println("\n\n\n\n");
  }
}
