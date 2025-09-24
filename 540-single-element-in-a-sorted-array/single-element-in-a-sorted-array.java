class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid > 0 && mid < n && (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]))
                return nums[mid];
            int leftlen = mid - low;
            int rightlen = high - mid;
            if (nums[mid] == nums[mid - 1]) { // left is match
                leftlen--;
                if (leftlen % 2 == 0) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            } else { // right is match
                rightlen--;
                if(rightlen%2==0){
                    high = mid - 1;
                }else {
                    low = mid;
                }
            }
        }
        return nums[low];
    }
}