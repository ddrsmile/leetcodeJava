package sols;
import java.util.*;

public class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<Integer>();
    if (matrix == null || matrix.length == 0) return res;
    int m = matrix.length, n = matrix[0].length;
    int x = 0, y = 0;
    while (m > 0 && n > 0) {
      if (m == 1) {
        for (int i = 0; i < n; i++) {
          res.add(matrix[x][y++]);
        }
        break;
      }
      else if (n == 1) {
        for (int i = 0; i < m; i++) {
          res.add(matrix[x++][y]);
        }
        break;
      }

      for (int i = 0; i < n - 1; i++) {
        res.add(matrix[x][y++]);
      }
      for (int i = 0; i < m - 1; i++) {
        res.add(matrix[x++][y]);
      }
      for (int i = 0; i < n - 1; i++) {
        res.add(matrix[x][y--]);
      }
      for (int i = 0; i < m - 1; i++) {
        res.add(matrix[x--][y]);
      }

      m -= 2;
      n -= 2;
      x++;
      y++;
    }
    return res;
  }
}
