package sols;

public class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    if (x < 10) return true;
    int max = Integer.MAX_VALUE;
    int tmp = x;
    int res = 0;
    for (; tmp != 0; tmp /= 10) {
      if (res != 0 && max/res < 10) return false;
      res = res*10 + tmp%10;
    }
    return res == x;
  }
}
