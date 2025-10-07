class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns
        int st = 0 , end = n-1;

        while(st<m && end>=0){
            if(matrix[st][end]==target) return true;
            else if(matrix[st][end]>target) end--;
            else st++;
        }
        return false;
    }
}