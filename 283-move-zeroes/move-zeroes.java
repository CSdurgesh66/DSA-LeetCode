class Solution {
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    if(nums[j]==0 && nums[j+1]!=0) swap(nums,j,j+1);
                }
        }
    }
}