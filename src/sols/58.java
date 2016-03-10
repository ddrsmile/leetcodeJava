package sols;
import java.util.*;

public class Solution {
  public int lengthOfLastWord(String s) {
    if (s == null || s.trim().length() == 0) return 0;
    s = s.trim();
    int cnt = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') break;
      cnt++;
    }
    return cnt;
  }
}
