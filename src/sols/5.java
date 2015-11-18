package sols;

public class Solution {
  public String longestPalindrome(String s) {
    if (s == null || s.length() == 0) return "";
    String maxS = "";
    for (int i = 0; i < s.length(); i++) {
      String tmp = getPalindrome(s, i, i);
      maxS = maxS.length() > tmp.length()?maxS:tmp;
      tmp = getPalindrome(s, i, i + 1);
      maxS = maxS.length() > tmp.length()?maxS:tmp;
    }
    return maxS;
  }

  private String getPalindrome(String s, int low, int high) {
    while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
      low--;
      high++;
    }
    return s.substring(low + 1, high);
  }
}
