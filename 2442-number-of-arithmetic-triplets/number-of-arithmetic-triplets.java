class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int count = 0;
        for(int num:nums){
            if(set.contains(num+diff) && set.contains(num+ 2*diff)) count++;
        }

        return count;
    }
}