package sols;
import java.util.*;

public class Solution {
  public void rotate(int[][] matrix) {
    int n = matrix.length;
    if (n <= 1) return;
    int rows = n/2;
    int cols = n%2==0?n/2:n/2+1;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = tmp; 
      }
    }
  }
}
