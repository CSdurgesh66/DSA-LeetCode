class Solution {
    public int findMin(int[] nums) {
         int n = nums.length;
        int low = 0, high = n - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(nums[low] <= nums[mid]) { // means this half is sorted
               min = Math.min(min,Math.min(nums[low],nums[mid]));
               low = mid + 1;
               
            }else { // means right half is sorted
              min = Math.min(min,nums[mid]);
              high = mid - 1;
            }
        }
        return min;
    }
}