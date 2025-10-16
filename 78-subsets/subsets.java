class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int subsets = 1 << n;
        for(int num = 0 ; num<subsets;num++){
            ArrayList<Integer> l = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if((num & (1<<i)) != 0){
                    l.add(nums[i]);
                }
            }
            res.add(l);
        }
        return res;
    }
}