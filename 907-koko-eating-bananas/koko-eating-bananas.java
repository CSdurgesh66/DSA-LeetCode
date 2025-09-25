class Solution {
    private boolean helper(int[] piles, int h, int k) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1L) / k; // ceil
        }
        return totalHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int max = 0;
        for (int val : piles) {
            max = Math.max(max, val);
        }

        int low = 1, high = max;
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (helper(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;

    }
}