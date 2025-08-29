class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums){
            if(set.contains(val)) set.remove(val);
            else set.add(val);
        }
        for(int val:set){
            return val;
        }
        return -1;
    }
}