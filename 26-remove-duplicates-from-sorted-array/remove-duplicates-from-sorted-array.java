class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0 , j = 0;
        while(j<n){
            if(nums[i]!=nums[j]){
                swap(nums,i+1,j);
                i++;
            }
            j++;
        }

        return i+1;
    }
}