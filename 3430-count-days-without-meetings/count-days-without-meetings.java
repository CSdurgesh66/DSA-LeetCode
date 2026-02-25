class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b) -> a[0] - b[0]);
    
        int n = meetings.length;
        int prevst = meetings[0][0];
        int prevend = meetings[0][1];
        int meetingDays = 0;
        for(int i=1;i<n;i++){
            int currst = meetings[i][0];
            int currend = meetings[i][1];

            if(prevend >= currst){
                prevst = Math.min(prevst,currst);
                prevend = Math.max(prevend,currend);
            }else {
                meetingDays += prevend - prevst + 1;
                prevst = currst;
                prevend = currend;
            }
        }
        meetingDays += prevend - prevst + 1;
        return days - meetingDays;
    }
}