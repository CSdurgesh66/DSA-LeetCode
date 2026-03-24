class Solution {
    int[][] t = new int[1001][1001];
    public int checkPalindrome(String s,int i, int j) {
       if(i>=j) return 1;

       if(t[i][j]!=-1){
        return t[i][j];
       }

       if(s.charAt(i)==s.charAt(j)){
        return t[i][j]=checkPalindrome(s,i+1,j-1);
       }
       return 0;
    }

    public String longestPalindrome(String s) {
        int n  = s.length();
       
       int maxLen = Integer.MIN_VALUE;
       int sp = 0;
        if(n==1) return s;
        for (int i = 0; i < t.length; i++) {
            Arrays.fill(t[i], -1);
        }
        for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
            if(checkPalindrome(s,i,j) == 1){
                if(j-i+1 > maxLen){
                    maxLen = j-i+1;
                    sp = i;
                }
            }
           }
         }
        return s.substring(sp,sp+maxLen);
    }
}