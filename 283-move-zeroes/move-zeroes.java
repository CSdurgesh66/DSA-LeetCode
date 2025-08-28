class Solution {
     public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p=0;
        boolean flag = true;
        int zeroes = 0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                if(flag){
                    p = j;
                    flag = false;
                }
                zeroes++;
              
            }
        }
        if(zeroes==0) return;
        int i = p+1;
        while(i<n){
            if(nums[i]!=0){
                nums[p] = nums[i];
                p++;
                i++;
            } else i++;
        }
        for(int k=n-1;k>=n-zeroes;k--){
            nums[k] = 0;
        }
    }
}