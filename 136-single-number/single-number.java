class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int offset = 30000;
        int[] hash = new int[60001];
        for(int val:nums){
          hash[val+offset]++;
        }
        for(int val:nums){
            if(hash[val+offset]==1){
                return val;
            }
        }
        return -1;
    }
}