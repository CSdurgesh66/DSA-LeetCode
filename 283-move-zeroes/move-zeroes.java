class Solution {
     public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0, j=0;
        while(i<n-1 && j<n){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else j++;
        }
    }
}