class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        if(prefixSum[0]==prefixSum[n-1]) return 0;

        for(int i=1;i<n;i++){
            if(prefixSum[i-1]==prefixSum[n-1]-prefixSum[i]){
                return i;
            }
        }
        return -1;
    }
}