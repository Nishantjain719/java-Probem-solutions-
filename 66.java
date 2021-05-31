/* nums=[10,5,2,6] k = 100 output: 8 bc 8 subarrays that have product less than 100 are
: [10], [5], [2], [6], [10,5] [5,2] [2,6] [5,2,6]   */
class Solutin42 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int prod = 1;
        int result = 0;

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            prod *= nums[right];

            while (prod >= k) {
                prod /= nums[left];
                left++;
            }

            result += right - left + 1; // +1 for that indivisual subarray like[5]
            right++;
        }

        return result;
    }
}
