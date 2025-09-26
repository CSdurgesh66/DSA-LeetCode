class Solution {
    public boolean helper(int[] bloomDay, int m, int k, int day){
        int n = bloomDay.length;
        boolean[] mark = new boolean[n];
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                mark[i] = true;
            }
        }

        ArrayList<Integer> grp = new ArrayList<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(mark[i]){
                cnt++;
            }else{
                grp.add(cnt);
                cnt = 0;
            } 
        }
        grp.add(cnt);

        int total = 0;
        for(Integer val:grp){
            total +=  val/k;
        }
        if(total>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int max = 0;
        for(int val:bloomDay){
            max = Math.max(max,val);
        }

        // for(int day=1;day<=max;day++){
        //     if(helper(bloomDay,m,k,day)){
        //         return day;
        //     }
        // }
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