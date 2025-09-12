class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int n = r * c;
        int[] arr = new int[n];
        int idx = 0;
        for(int i=0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[idx++] = grid[i][j];
            }
        }
        int missing = -1, repeating = -1;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                repeating = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[] { repeating, missing };
    }
}