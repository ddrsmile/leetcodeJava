package sols;

public class Solution {
  public int reverse(int x) {
    int max = Integer.MAX_VALUE/10;
    int res = 0;
    for (; x != 0; x/=10) {
      if (res != 0 && (res > max || res < -max)) {
        return 0;
      }
      res = res*10 + x%10;
    }
    return res;
  }
}
