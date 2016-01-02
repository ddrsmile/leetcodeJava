package sols;
import java.util.*;

public class Solution {
  public int divide(int dividend, int divisor) {
    if (divisor == 0) return dividend > 0? Integer.MAX_VALUE:Integer.MIN_VALUE;
    if (dividend == 0) return 0;
    if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;

    boolean isNeg = !((dividend > 0 && divisor >0) || (dividend < 0 && divisor < 0));
    long dividendL = Math.abs((long) dividend);
    long divisorL = Math.abs((long) divisor);
    if (dividendL < divisorL) return 0;
    int res = 0;
    while (dividendL >= divisorL) {
      long tmp = divisorL, tmpRes = 1;
      while (dividendL >= (tmp<<1) && (tmp<<1) > divisorL) {
        tmp <<= 1;
        tmpRes <<= 1;
      }
      res += (int)tmpRes;
      dividendL -= tmp;
    }
    return isNeg?-res:res;
  }
}
