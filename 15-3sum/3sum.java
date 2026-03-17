class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            HashSet<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(hashset.contains(third)){
                    List<Integer> l = new ArrayList<>();
                    l.addAll(Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(l);
                    set.add(l);
                }
                hashset.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> l:set){
            ans.add(l);
        }

        return ans;
    }
}