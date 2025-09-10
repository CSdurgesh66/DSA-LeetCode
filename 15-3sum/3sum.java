class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
       for(int i=0;i<n-2;i++){
        if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1 , k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k]; 
                if(sum==0){
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    ans.add(list);
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[j]==nums[j+1]) k++;
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else k--;
            }
        }
        return ans;
        
    }
}