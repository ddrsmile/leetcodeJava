package sols;
import java.util.Arrays;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) return 0;
    int[] map = new int[256];
    Arrays.fill(map, -1);
    int x = -1;
    int res = 0;
    
    for (int i = 0; i < s.length(); i++) {
      int pos = s.charAt(i);
      x = Math.max(x, map[pos] + 1);
      map[pos] = i;
      res = Math.max(res, i - x + 1);
    }
    return res;
  }
}
