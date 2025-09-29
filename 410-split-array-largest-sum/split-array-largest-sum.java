class Solution {
    public boolean isPossible(int[] arr, int k , int max){
       int student = 1;
        int sum = 0;

        for (int val : arr) {
            if (sum + val <= max) {
               sum += val;
            } else {
                student++;
                sum = val;
            }
        }
        return student <= k;
    }
    public int splitArray(int[] arr, int k) {
        int max=0;
        int sum = 0;
        for(int val:arr){
            max = Math.max(val,max);
            sum += val;
        }
        if(arr.length < k) return -1;
        int low = max , high = sum;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(arr,k,mid)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans; 
    }
}