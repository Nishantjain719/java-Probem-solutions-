// sliding window problem i would be ending boundry and anchor would be keep track of new beinging of boundry(sliding window) and re-expands and look for max update every single time
// input: [1,3,5,4,7] output: 3 Longest Continuous Increasing Subsequence
class Solutin42 {
    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int anchor = 0;

        for (int i=0; i<nums.length; i++) {
            if (i > 0 && nums[i-1] >= nums[i]) anchor = i;
            result = Math.max(result, i - anchor + 1);
        }
        return result;
    }
}
