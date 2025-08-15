class Solution {
    public static int helper(int[] nums, int k) {
        int n = nums.length;
        int totalSubArr = 0;
        int l = 0, r = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        while (r < n) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            while (freq.size() > k) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                if (freq.get(nums[l]) == 0) {
                    freq.remove(nums[l]);
                }
                l++;
            }
            totalSubArr = totalSubArr + (r - l + 1);
            r++;
        }
        return totalSubArr;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        return helper(nums, k) - helper(nums, k - 1);
    }
}