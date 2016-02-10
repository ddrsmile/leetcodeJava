package sols;
import java.util.*;

public class Solution {
  public double myPow(double x, int n) {
    if (n < 0) {
      return 1/helper(x, -n);
    } else {
      return helper(x, n);
    }
  }
  private double helper(double x, int n) {
    if (n == 0) return 1;
    double v = helper(x, n/2);
    if (n%2 == 0) {
      return v*v;
    } else {
      return v*v*x;
    }
  }
}
