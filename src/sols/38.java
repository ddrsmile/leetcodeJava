package sols;
import java.util.*;

public class Solution {
  public String countAndSay(int n) {
    String res = "1";
    if (n <= 1) return res;
    while (n > 1) {
      int cnt = 1;
      String cur = res;
      res = "";
      for (int i = 1; i < cur.length(); i++) {
        if (cur.charAt(i) == cur.charAt(i - 1)) {
          cnt++;
        } else {
          res += Integer.toString(cnt) + (cur.charAt(i - 1) - '0');
          cnt = 1;
        }
      }
      res += Integer.toString(cnt) + (cur.charAt(cur.length() - 1) - '0');
      n--;
    }
    return res;
  }
}
