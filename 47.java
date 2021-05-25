// [4,3,2,7,8,2,3,1] output: [2,3] O(n) 
import java.util.ArrayList;
import java.util.List;

class Solutin42 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output_arr = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) output_arr.add(index + 1);
            nums[index] = -nums[index];

        }
        return output_arr;
    }
}
