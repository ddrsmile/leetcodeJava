package sols;
import java.util.*;

public class Solution {
  public int romanToInt(String s) {
    int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int res = 0;
    for (int i = 0; i < symbols.length; i++) {
      if (s.length() == 0) break;
      if (i%2==0) {
        while (s.substring(0,1).equals(symbols[i])) {
          res += vals[i];
          s = s.substring(1);
          if (s.length() < 1) break;
        }
      } else {
        if (s.length() >= 2) {
          while (s.substring(0,2).equals(symbols[i])) {
            res += vals[i];
            s = s.substring(2);
            if (s.length() < 2) break;
          }
        }
      }
    }
    return res;
  }
}
