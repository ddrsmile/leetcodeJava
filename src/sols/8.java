package sols;

public class Solution {
  public int myAtoi(String s) {
    s = s.trim();
    if (s.length() == 0) return 0;

    long res = 0;
    int i = 0;
    boolean isNeg = false;

    if (s.charAt(0) == '-') {
      isNeg = true;
      i++;
    }
    if (s.charAt(0) == '+') i++;

    while (s.length() > i && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
      res = res*10 + (s.charAt(i) - '0');
      i++;
    }
    if (isNeg) res = -res;
    if (res > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    } else if (res < Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    } else {
      return (int)res;
    }
  }
}
