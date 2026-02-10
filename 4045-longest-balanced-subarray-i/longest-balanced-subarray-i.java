class Solution {
    public int subArray(int[] arr){
        int maxi = 0;
        int n =  arr.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> evenset = new HashSet<>();
            HashSet<Integer> oddset = new HashSet<>();
            for(int j=i;j<n;j++){
               if((arr[j]&1)==0) evenset.add(arr[j]);
               else oddset.add(arr[j]);

               if(evenset.size()==oddset.size()){
                  maxi = Math.max(maxi,j-i+1);
               }
            }
        }
        return maxi;
    }
   
    public int longestBalanced(int[] nums) {
        return subArray(nums);
    }
}