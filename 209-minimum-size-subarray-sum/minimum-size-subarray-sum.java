class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int sum = 0;
        while (r < n) {
            sum += nums[r];
            if (sum >= target) {
                int len = r - l + 1;
                min = Math.min(min, len);
            }
            while(l<r && (sum-nums[l]) >= target){
                sum -= nums[l];
                l++;
                int len = r - l + 1;
                min = Math.min(min, len);
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}