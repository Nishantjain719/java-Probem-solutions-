// we use integers 0, 1, 2 to represent the color red, white and blue. sort them in-place so that
// objects of the same color are adjacent. input: [2,0,2,1,1,0] output: [0,0,1,1,2,2]
import java.util.*;

class Solutin23 {
    public void sortColor(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return;

        int start = 0;
        int end = nums.length-1;
        int index = 0;

        while (index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            } else if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                index++;
            }
        }
    }
}
