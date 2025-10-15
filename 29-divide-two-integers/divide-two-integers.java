class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int quotient = 0;
        while (n >= d) { 
            int count = 0;
            while(n >= (d<<(count+1))){
                count++;
            }
            quotient += 1<<count;
            n = n - (d<<count);
        }
        return (dividend > 0) == (divisor > 0) ? quotient : -quotient;
    }
}