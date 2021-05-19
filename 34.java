// we may change up to k values from 0 to 1 return the length of longest subarray that contains only 1s.
// input; A = [1,1,1,0,0,0,1,1,1,1,0] K = 2 OUTPUT: 6(sliding window)
import java.util.*;

class Solutin23 {
    public int longestOnes(int[] A, int K) {
        int i = 0;
        int j = 0;

        while (i < A.length) {
            if (A[i] == 0) K--;
            if (K < 0) {
                if (A[j] == 0) {
                    K++;
                }
                j++;
            }
            i++;
        }
        return i-j;
    }
}
