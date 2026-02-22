class Solution {
    public int[][] merge(ArrayList<int[]> list){
        int n = list.size();
        ArrayList<int[]> ans = new ArrayList<>();
        int[] firstInterval = list.get(0);
        int prevst = firstInterval[0];
        int prevend = firstInterval[1];
        for(int i=1;i<n;i++){
            int[] curr = list.get(i);

            if(prevend >= curr[0]){
                prevend = Math.max(prevend,curr[1]);
            }else {
                ans.add(new int[]{prevst,prevend});
                prevst = curr[0];
                prevend = curr[1];
            }
        }
        ans.add(new int[]{prevst,prevend});
        return ans.toArray(new int[ans.size()][]);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        int n = intervals.length;
        if(n==0){
            list.add(newInterval);
            return list.toArray(new int[list.size()][]);
        }
        boolean first = true;
        for(int i=0;i<n;i++){
            if(intervals[i][0]>newInterval[0] && first){
                list.add(newInterval);
                first = false;
            }
            list.add(intervals[i]);
        }
        if(first){
            list.add(newInterval);
            first = false;
        }
        return merge(list);
    }
}