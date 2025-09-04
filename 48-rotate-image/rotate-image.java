class Solution {
    public void reverse(int[][] matrix,int row){
        int st = 0 , end = matrix.length-1;
        while(st<end){
            int temp = matrix[row][end];
            matrix[row][end] = matrix[row][st];
            matrix[row][st] = temp;
            st++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix,i);
        }
    }
}