class Solution {
    public boolean helper(int[] bloomDay, int m, int k, int day){
        int n = bloomDay.length;
        int count = 0 , bouquets = 0;
        for(int bloom : bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouquets++;
                    count = 0;
                }
            }else {
                count = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m*k) return -1;
        int max = 0;
        for(int val:bloomDay){
            max = Math.max(max,val);
        }
        int low = 1 , high = max;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(helper(bloomDay,m,k,mid)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }

        return ans;
    }
}