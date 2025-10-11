class Solution {
    public int findXor(int[] arr, int left, int right){
         int n = arr.length;
         int xor = 0;
         for(int i=left;i<=right;i++){
            xor ^= arr[i];
         }
         return xor;
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int qn = queries.length;
        int[] ans = new int[qn];
        for(int i=0;i<qn;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int xor = findXor(arr,left,right);
            ans[i] = xor;
        }
        return ans;
    }
}