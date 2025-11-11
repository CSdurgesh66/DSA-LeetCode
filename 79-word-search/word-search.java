class Solution {
    public boolean dfs(int r,int c,char[][] board,int[] delrow, int[] delcol,String word,int j,boolean[][] vis){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || vis[r][c]) return false;

        if(word.charAt(j)!=board[r][c]) return false;
        if (j == word.length() - 1) return true;

        vis[r][c] = true;

        for(int i=0;i<4;i++){
            if(dfs(r+delrow[i],c+delcol[i],board,delrow,delcol,word,j+1,vis)){
                return true;
            }
        }

        vis[r][c] = false;
        return false;
        
    }
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] vis = new boolean[rows][cols];
        int[] delrow =  {-1,0,0,1};
        int[] delcol = {0,-1,1,0};
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (board[i][j] == word.charAt(0)){
                    if(dfs(i,j,board,delrow,delcol,word,0,vis)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}