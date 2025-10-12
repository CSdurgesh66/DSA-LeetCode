class Solution {
    public void findXor(int[] arr,int[] prefixXor){
         int n = arr.length;
         int xor = 0;
         for(int i=0;i<n;i++){
            prefixXor[i+1] = prefixXor[i] ^ arr[i];
         }
         return;
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int qn = queries.length;
        int[] ans = new int[qn];
        int[] prefixXor = new int[n+1];
        prefixXor[0] = 0;
        findXor(arr,prefixXor);

        for(int i=0;i<qn;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = prefixXor[right+1] ^ prefixXor[left];
        }
        return ans;
    }
}