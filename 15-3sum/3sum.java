class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j = i+1 , k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k]; 
                if(sum==0){
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    set.add(list);
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else k--;
            }
        }
        for(List<Integer> l : set){
            ans.add(l);
        }
        return ans;
        
    }
}