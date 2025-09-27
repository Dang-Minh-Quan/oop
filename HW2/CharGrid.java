public class CharGrid {

  private char[][] grid;
  private int rows;
  private int cols;

  public CharGrid(char[][] grid) {
    this.grid = grid;
    if (grid.length > 0) {
      this.rows = grid.length;
      this.cols = grid[0].length;
    } else {
      this.rows = 0;
      this.cols = 0;
    }
  }
  
  public int charArea(char ch) {
    int minRow = Integer.MAX_VALUE;
    int maxRow = Integer.MIN_VALUE;
    int minCol = Integer.MAX_VALUE;
    int maxCol = Integer.MIN_VALUE;
    int count = 0;

    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        if (grid[r][c] == ch) {
          count++;
          minRow = Math.min(minRow, r);
          maxRow = Math.max(maxRow, r);
          minCol = Math.min(minCol, c);
          maxCol = Math.max(maxCol, c);
        }
      }
    }

    if (count == 0) {
      return 0;
    }

    return (maxCol - minCol + 1) * (maxRow - minRow + 1);
  }

  public int countPlus() {
    if (rows < 3 || cols < 3) {
      return 0;
    }

    int count = 0;

    for (int r = 1; r < rows - 1; r++) {
      for (int c = 1; c < cols - 1; c++) {
        char centerChar = grid[r][c];

        int maxLen = 0;

        maxLen = Math.min(r, rows - 1 - r);
        maxLen = Math.min(maxLen, c);
        maxLen = Math.min(maxLen, cols - 1 - c);

        for (int len = 1; len <= maxLen; len++) {
          if (isPlus(r, c, len, centerChar)) {
            count++;
          }
        }
      }
    }
    return count;
  }

  private boolean isPlus(int r, int c, int len, char ch) {

    if (grid[r - len][c] != ch) {
      return false;
    }

    if (grid[r + len][c] != ch) {
      return false;
    }

    if (grid[r][c - len] != ch) {
      return false;
    }

    if (grid[r][c + len] != ch) {
      return false;
    }

    for (int k = 1; k < len; k++) {
      if (grid[r - k][c] != ch || grid[r + k][c] != ch ||
          grid[r][c - k] != ch || grid[r][c + k] != ch) {
        return false;
      }
    }
    return true;
  }
}