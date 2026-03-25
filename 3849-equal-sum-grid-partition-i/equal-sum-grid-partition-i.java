class Solution {
    public void preSum(long[] arr, long[] presum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            presum[i + 1] = presum[i] + arr[i];
        }
    }

    public boolean cut(long[] presum) {
        int n = presum.length;
        long total = presum[n - 1];

        for (int i = 1; i < n; i++) {
            long left = presum[i];
            long right = total - presum[i];

            if (left == right)
                return true;
        }

        return false;
    }

    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length; // row
        int n = grid[0].length; // col

        long[] horizontal = new long[m];
        for (int i = 0; i < m; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
            }
            horizontal[i] = sum;
        }

        long[] vertical = new long[n];
        for (int j = 0; j < n; j++) {
            long sum = 0;
            for (int i = 0; i < m; i++) {
                sum += grid[i][j];
            }
            vertical[j] = sum;
        }

        long[] hori_presum = new long[m + 1];
        long[] vert_presum = new long[n + 1];

        preSum(horizontal, hori_presum);
        preSum(vertical, vert_presum);

        if (cut(hori_presum))
            return true;
        if (cut(vert_presum))
            return true;

        return false;
    }
}