class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] positive = new int[len/2];
        int[] negative = new int[len/2];

        int pos = 0, neg = 0;
        for(int k=0;k<len;k++){
            if(nums[k]<0) negative[neg++] = nums[k];
            else positive[pos++] = nums[k];
        }

        int[] ans = new int[len];
        int i=0;
        pos = 0;
        neg = 0;
        while(i<len){
            ans[i] = positive[pos++];
            ans[i+1] = negative[neg++];
            i += 2;
        }
        return ans;
    }
}