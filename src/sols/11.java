package sols;
import java.util.*;

public class Solution {
  public int maxArea(int[] height) {
    if (height.length == 0) return 0;
    int max = 1<<31;
    int low = 0, high = height.length - 1;
    while (low < high) {
      int area = (high - low)*Math.min(height[low], height[high]);
      max = Math.max(area, max);
      if (height[low] < height[high]) {
        low++;
      } else {
        high--;
      }
    }
    return max;
  }
}
