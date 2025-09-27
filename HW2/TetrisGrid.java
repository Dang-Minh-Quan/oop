public class TetrisGrid {

  private boolean[][] grid;
  private int width;
  private int height;


  public TetrisGrid(boolean[][] initialGrid) {
    this.width = initialGrid.length;
    if (this.width > 0) {
      this.height = initialGrid[0].length;
    } else {
      this.height = 0;
    }
    this.grid = initialGrid;
  }


  public boolean[][] getGrid() {
    return grid;
  }

  public void clearRows() {
    if (width == 0 || height == 0) {
      return;
    }

    int destY = 0;

    for (int sourceY = 0; sourceY < height; sourceY++) {
      boolean isRowFull = true;

      for (int x = 0; x < width; x++) {
        if (!grid[x][sourceY]) {
          isRowFull = false;
          break;
        }
      }

      if (!isRowFull) {
        if (sourceY != destY) {
          for (int x = 0; x < width; x++) {
            grid[x][destY] = grid[x][sourceY];
          }
        }
        destY++;
      }

    }

    for (int y = destY; y < height; y++) {
      for (int x = 0; x < width; x++) {
        grid[x][y] = false;
      }
    }
  }
}