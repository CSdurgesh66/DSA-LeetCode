class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int m = matrix.length; // rows
      int n = matrix[0].length; // columns
      int low = 0 , high = m*n-1;

      while(low<=high){
        int mid = low + (high - low)/2;
        int r = mid/n;
        int c = mid%n;
        int midele = matrix[r][c];
        if(target==midele){
            return true;
        }else if(midele<target){
            low = mid + 1;
        }else high = mid - 1;
      }
      return false;
    }
}