class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int delrow[] = {0,-1,1,0};
        int delcol[] = {1,0,0,-1};
        boolean flag = true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1>=0 && mat[i-1][j]>mat[i][j]){
                    flag = false;
                }
                if(i+1<m && mat[i+1][j]>mat[i][j]){
                    flag = false;
                }
                if(j-1>=0 && mat[i][j-1]>mat[i][j]){
                    flag = false;
                }
                if(j+1<n && mat[i][j+1]>mat[i][j]){
                    flag = false;
                }
                if(flag){
                    return new int[]{i,j};
                }
                flag = true;
            }
        }
        return new int[]{-1,-1};
    }
}