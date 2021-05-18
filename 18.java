// Hashmap is better bcz we just store things and we pull them down at constant time
// Two sum given nums = [2,7,11,15] target = 9, return {0, 1} bncz nums[0] + nums[1] = 2 + 7  = 9
import java.util.*;

class Solutin18 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];

            if (num_map.containsKey(complement)) {
  // we we find the complement in Hashmap already we can just pull that index and retuened along with index of currrent time.(constant time pull)
                return new int[] {num_map.get(complement), i};
            }
// we are accesing Hashmap and adding in the ith element along with its index
            num_map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
