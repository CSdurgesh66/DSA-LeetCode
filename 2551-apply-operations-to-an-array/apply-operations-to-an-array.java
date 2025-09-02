class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                ans[i] = nums[i]*2;
                nums[i+1] = 0;
            }else {
                ans[i] = nums[i];
            }
        }
        ans[n-1] = nums[n-1];

        int i=0;
        int j=0;
        while(j<n){
            if(ans[j]!=0){
                ans[i] = ans[j];
                i++;
            }
            j++;
        }
        while(i<n){
            ans[i] = 0;
            i++;
        }

        return ans;
    }
}