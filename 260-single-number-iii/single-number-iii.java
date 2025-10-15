class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums){
            xor = xor^num;
        }
        int rightMostBit = (xor &(xor-1)) ^ xor;
        int b1 = 0 , b2 = 0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & rightMostBit) != 0){
                b1 = b1 ^ nums[i];
            }else {
                b2 = b2 ^ nums[i];
            }
        }
        return new int[]{b1,b2};
    }
}