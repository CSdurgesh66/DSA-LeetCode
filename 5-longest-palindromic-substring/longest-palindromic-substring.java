class Solution {
    public boolean checkPalindrome(String str){
        int n = str.length();
        int l = 0 , r = n-1;
        while(l<r){
            if(str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n  = s.length();
        int min = 0;
        String ans = "";

        if(n==1) return s;
        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    String str = s.substring(i,j+1);
                    if(checkPalindrome(str)){
                        if(ans.length()< str.length()){
                            ans = str;
                            break;
                        }
                    }
                }
            }
        }
        ans = (ans=="") ? s.charAt(0)+"":ans;
        return ans;
    }
}