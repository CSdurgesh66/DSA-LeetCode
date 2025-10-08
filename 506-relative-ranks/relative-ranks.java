class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b] - score[a]);

        for (int i = 0; i < n; i++) {
            pq.add(i);
        }
        int i = 1;
        while (!pq.isEmpty()) {
            int index = pq.poll();
            if (i == 1) {
                ans[index] = "Gold Medal";
            } else if (i == 2) {
                ans[index] = "Silver Medal";
            } else if (i == 3) {
                ans[index] = "Bronze Medal";
            } else {
                ans[index] = Integer.toString(i);
            }
            i++;
        }
        return ans;
    }
}