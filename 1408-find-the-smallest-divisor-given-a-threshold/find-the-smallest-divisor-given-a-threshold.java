class Solution {
    private boolean helper(int[] nums, int threshold, int divisor) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += (num + divisor - 1L) / divisor; // ceil
        }
        return totalSum <=threshold ;
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int n = nums.length;
        int max = 0;
        for (int val : nums) {
            max = Math.max(max, val);
        }

        int low = 1, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (helper(nums, threshold, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }
}