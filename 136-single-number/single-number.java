class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int val:nums){
            xor=xor^val;
        }
        return xor;
    }
}