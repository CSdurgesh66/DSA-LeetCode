class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        int r = 0, c = n-1; 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[r][c] = matrix[i][j];
                r++;
            }
            r = 0;
            c--;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = mat[i][j];
            }
        }

    }
}