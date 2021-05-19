// Rotate an array to the right by k steps
// trick- reverse all numbers, after that reverse first k nums, and then reverse last n-k numbers.
import java.util.*;

class Solutin23 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp; // to retain(not loose) reference to start
            start++;
            end--;
        }
    }
}
