class Solution {
    public int singleNumber(int[] nums) {
        int res =0;
      for(int k=0;k<32;k++){
        int temp = 1<<k;
        int countOne = 0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&temp)!=0){
                countOne++;
            }
        }
        if(countOne%3!=0){
      res = res|temp;
        }
      }  
      return res;
    }
}