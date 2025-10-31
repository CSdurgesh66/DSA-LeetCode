class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = nums.length - 1;
        for(int num:nums){
            if(num%2==1){
                ans[i--] = 1;
            }
        }
        return ans;
    }
}