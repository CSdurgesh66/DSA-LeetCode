class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Pair> q = new LinkedList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            Pair it = q.poll();
            int row = it.row;
            int col = it.col;
            for(int j=0;j<n;j++){
                matrix[row][j] = 0;
            }
            for(int i=0;i<m;i++){
                 matrix[i][col] = 0;
            }
        }
    }
}