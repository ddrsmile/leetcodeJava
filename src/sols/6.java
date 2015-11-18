package sols;
import java.util.*;

public class Solution {
  public String convert(String s, int nRow) {
    if (s == null || s.length() == 0) return "";
    if (nRow == 1) return s;
    StringBuilder sb = new StringBuilder();
    int size = 2*nRow - 2;
    for (int i = 0; i < nRow; i++) {
      for (int j = i; j < s.length(); j += size) {
        sb.append(s.charAt(j));
        if (i != 0 && i != nRow - 1) {
          int tmp = j + size - 2*i;
          if (tmp < s.length()) {
            sb.append(s.charAt(tmp));
          }
        }
      }
    }
    return sb.toString();
  }
}
