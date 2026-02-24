class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n==1) return n;

        Arrays.sort(intervals,(a,b) -> {
            if(a[0] == b[0]){
                return Integer.compare(b[1],a[1]);
            }
            return Integer.compare(a[0], b[0]); 
        });
        int cnt = 1;
        int prevst = intervals[0][0];
        int prevend = intervals[0][1];
        for(int i=1;i<n;i++){
            int currst = intervals[i][0];
            int currend = intervals[i][1];

            if(currend <= prevend){
                continue;
            }else {
                cnt++;
                prevst = currst;
                prevend = currend;
                
            }
        }
        return cnt;
    }
}