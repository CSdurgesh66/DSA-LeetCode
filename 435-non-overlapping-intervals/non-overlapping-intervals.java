class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        
        int prevst = intervals[0][0];
        int prevend = intervals[0][1];
        int count = 0;
        for(int i=1;i<n;i++){
            int currst = intervals[i][0];
            int currend = intervals[i][1];

            if(prevend > currst){
                count++;
            }
            else {
                prevst = currst;
                prevend = currend;
            }
        }

        return count;
    }
}