package sols;
import java.util.Arrays;

public class Solution {
  public double findMedianSortedArrays(int[] arr1, int[] arr2) {
    int m = arr1.length;
    int n = arr2.length;
    int total = m + n;
    if (total%2 != 0) {
      return (double) findKthOfTwoArrays(arr1, 0, m - 1, arr2, 0, n - 1, total/2 + 1);
    } else {
      double x = findKthOfTwoArrays(arr1, 0, m - 1, arr2, 0, n - 1, total/2);
      double y = findKthOfTwoArrays(arr1, 0, m - 1, arr2, 0, n - 1, total/2 + 1);
      return (x + y)/2;
    }
  }
  private int findKthOfTwoArrays(int[] A, int aS, int aE, int[] B, int bS, int bE, int k) {
    int m = aE - aS + 1;
    int n = bE - bS + 1;
    if (m > n) {
      return findKthOfTwoArrays(B, bS, bE, A, aS, aE, k);
    }

    if (m == 0) {
      return B[k - 1];
    }

    if (k == 1) {
      return A[aS] < B[bS]? A[aS]:B[bS];
    }

    int partA = k/2 < m? k/2:m;
    int partB = k - partA;
    if (A[aS + partA - 1] < B[bS + partB - 1]) {
      return findKthOfTwoArrays(A, aS + partA, aE, B, bS, bE, k - partA);
    } else if (A[aS + partA - 1] > B[bS + partB - 1]) {
      return findKthOfTwoArrays(A, aS, aE, B, bS + partB, bE, k - partB);
    } else {
      return A[aS + partA - 1];
    }
  }
}
