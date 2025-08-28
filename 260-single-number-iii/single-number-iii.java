class Solution {
    public int[] singleNumber(int[] nums) {
       int res =0;
    for(int i=0;i<nums.length;i++){
        res ^= nums[i];
    }
    int diff = res&-res;
    int a=0;
    int b=0;
    for(int x:nums){
        if((x&diff) !=0){
            a ^=x;
        }
        else{
            b ^= x;
        }
    }

    return new int[]{a,b}; 
    }
}