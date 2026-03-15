class Solution {
    public int minimumCost(int[] nums) {
       int n = nums.length;
       int sum = nums[0];
       int min = Integer.MAX_VALUE;
       int secmin = Integer.MAX_VALUE;
       for(int i=1;i<n;i++){
        if(nums[i]<min){
            secmin = min;
            min = nums[i];
        }else if(nums[i]<secmin && nums[i]>=min){
            secmin = nums[i];
        }
       }

       return sum+min+secmin;
    }
}