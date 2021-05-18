// nums1 = [4,1,2] nums2 = [1,3,4,2] output: [-1,3,-1]
import java.util.*;

class Solutin23 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> next_greatest = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer num : nums2) {
            while ( !stack.isEmpty() && stack.peek() < num) {
                next_greatest.put(stack.pop(), num);
            }
            stack.push(num);

        }
        
        for (int i=0; i<nums1.length; i++) {
            nums1[i] = next_greatest.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}