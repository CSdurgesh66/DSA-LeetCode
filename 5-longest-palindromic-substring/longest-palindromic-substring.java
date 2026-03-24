class Solution {
    public boolean checkPalindrome(String s,int i, int j) {
       if(i>=j) return true;

       if(s.charAt(i)==s.charAt(j)){
        return checkPalindrome(s,i+1,j-1);
       }
       return false;
    }

    public String longestPalindrome(String s) {
        int n  = s.length();
       
       int maxLen = Integer.MIN_VALUE;
       int sp = 0;
        if(n==1) return s;

        for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
            if(checkPalindrome(s,i,j) == true){
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