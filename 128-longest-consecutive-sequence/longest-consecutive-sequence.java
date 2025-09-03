class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(nums.length==0) return 0;
        int  maxCount = 1;
        
        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
            while(set.contains(num+1)){
                count++;
                maxCount=Math.max(maxCount,count);
                num++;
            }
        }
            }
        return maxCount;
    }
}