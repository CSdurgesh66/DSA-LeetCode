class Solution {
     public int helper(int[] nums, int goal){
        int n = nums.length;
        int count = 0;
        int l = 0, r = 0, sum = 0;
        if(goal<0) return 0;
        while(r<n){
            sum += nums[r]%2;
            while(sum>goal){
                sum -= nums[l]%2;
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
       return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
      int n = nums.length;
      return helper(nums,k) - helper(nums,k-1);
    }
}