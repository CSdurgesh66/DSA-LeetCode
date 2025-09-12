class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int n = r*c;

        long sum = 0, squareSum = 0;
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        for(int[] num: grid){
            for(int val:num){
                sum += val;
                squareSum +=(long) val*val; 
            }
        }

        long diff = expectedSum - sum;
        long squareDiff  = expectedSquareSum - squareSum;

        long sumD = squareDiff / diff;

        int missing = (int)((diff+sumD)/2);
        int repeating = (int)(sumD - missing);

        return new int[]{repeating,missing};
    }
}