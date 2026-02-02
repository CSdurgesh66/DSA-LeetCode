class Solution {
    public void helper(int[] nums,boolean[] used,List<Integer> ls, List<List<Integer>> ans){
        if(ls.size()==nums.length){
           ans.add(new ArrayList<>(ls)); 
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                ls.add(nums[i]);
                helper(nums,used,ls,ans);
                used[i] = false;
                ls.remove(ls.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums,used,ds,ans);
        return ans;   
    }
}