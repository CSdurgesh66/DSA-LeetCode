class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i=0;i<32;i++){
            int countOnes = 0;
            int countZeros = 0;
            for(int num : nums){
                if((1<<i & num)==0) countZeros++;
                else countOnes++;
            }

            total += countOnes * countZeros; 
        }
        return total;
    }
}