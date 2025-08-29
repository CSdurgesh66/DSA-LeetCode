class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int countOnes = 0;
        int maxCount = 0;
        for(int val:nums){
            if(val==1){
                countOnes++;
            }else {
                maxCount = Math.max(maxCount,countOnes);
                countOnes = 0;
            }
        }
        maxCount = Math.max(maxCount,countOnes);
        return maxCount;
    }
}