class Solution {
    public int myAtoi(String s) {

        int n = s.length();
        int sign = 1;
        long ans = 0;

        int i=0;
        while(i<n && s.charAt(i)==' ') i++;

        if(i<n && (s.charAt(i)=='-' || s.charAt(i) == '+')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        } 
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            ans = ans * 10 + digit;
            if (sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
       return (int)(sign * ans);
    }
}