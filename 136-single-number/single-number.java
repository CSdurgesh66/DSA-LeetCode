class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int offset = 30000;
        int[] hash = new int[60001];
        for(int val:nums){
          hash[val+offset]++;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==1){
                return i-offset;
            }
        }
        return -1;
    }
}