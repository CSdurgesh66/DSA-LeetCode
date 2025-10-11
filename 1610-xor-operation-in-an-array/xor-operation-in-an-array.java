class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        int num = start;
        for(int i=1;i<=n;i++){
            xor ^= num;
            num += 2; 
        }
        return xor;
    }
}