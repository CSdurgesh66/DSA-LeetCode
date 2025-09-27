class Solution {
    public boolean isPossible(int[] weights, int cap ,int days){
        int shipdays = 0;
        int sum = 0;
        for(int weight:weights){
           sum += weight;
           if(sum>cap){
            shipdays++;
            sum = weight;
           }
        }
        shipdays++;
        
        return shipdays<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int maxSum = 0;
        int max = 0;
        for(int val:weights){
            maxSum += val; 
            max = Math.max(max,val);
        }

        int low = max , high =maxSum;
        while(low<high){
            int mid = low + (high-low)/2;
            if(isPossible(weights,mid,days)){
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
}