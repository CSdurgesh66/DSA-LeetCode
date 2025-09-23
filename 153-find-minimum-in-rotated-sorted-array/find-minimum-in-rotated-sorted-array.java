class Solution {
    public int findMin(int[] nums) {
         int n = nums.length;
        int low = 0, high = n - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low)/2;
            min = Math.min(min,nums[mid]);
            if(nums[mid] > nums[high]){ // means this is unsorted part , and min is always present in the unsorted part
             low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return min;
    }
}