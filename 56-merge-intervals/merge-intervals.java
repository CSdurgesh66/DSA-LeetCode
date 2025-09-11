class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        int r = intervals.length;
        if(r==1) return intervals;
        Arrays.sort(intervals, new myComparator());
        int[] prevIntervals = intervals[0];
        for (int i = 1; i < r; i++) {
            if (prevIntervals[1] >= intervals[i][0]) {
                int min = Math.min(prevIntervals[0], intervals[i][0]);
                int max = Math.max(prevIntervals[1], intervals[i][1]);
                prevIntervals = new int[] {min,max};
            } else {
                list.add(prevIntervals);
                prevIntervals = intervals[i];
                // list.add(intervals[i]);
            }
        }
        list.add(prevIntervals);

        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

class myComparator implements Comparator<int[]> {
    public int compare(int[] r1, int[] r2) {
        Integer a = r1[0];
        Integer b = r2[0];
        return a.compareTo(b);
    }
}