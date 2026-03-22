class Solution {
    public boolean rotate(int[][] matrix, int[][] target) {
    int n = matrix.length;

    // transpose
    for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // reverse
    for(int i = 0; i < n; i++){
        int left = 0, right = n - 1;
        while(left < right){
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }

    return Arrays.deepEquals(matrix, target);
}
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        if(Arrays.deepEquals(mat, target)) return true;
        for(int i=0;i<3;i++){
            if(rotate(mat,target)){
                return true;
            }
        }
        return false;
    }
}