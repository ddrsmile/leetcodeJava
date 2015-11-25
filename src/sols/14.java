package sols;
import java.util.*;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    String lcp = strs[0];
    for (String s:strs) {
      lcp = lcp.length()<s.length()?lcp:s;
    }

    for (int i = 0; i < lcp.length(); i++) {
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].charAt(i) != strs[j-1].charAt(i)) {
          return lcp.substring(0,i);
        }
      }
    }
    return lcp;
  }
}
