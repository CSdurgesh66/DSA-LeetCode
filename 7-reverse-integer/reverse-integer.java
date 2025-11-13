class Solution {
    public int reverse(int x) {
        long res=0;
        for(int i=0;x!=0;i++){
            int rem=x%10;
            x=x/10;
            res=res*10+rem;

        }
        if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE) return 0;
        return (int)res; 
    }
}