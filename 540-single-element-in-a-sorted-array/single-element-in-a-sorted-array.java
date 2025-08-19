class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums){
            if(set.contains(val)) set.remove(val);
            else set.add(val);
        }
       for(int val:set){
        return val;
       }
       return 0;
    }
}