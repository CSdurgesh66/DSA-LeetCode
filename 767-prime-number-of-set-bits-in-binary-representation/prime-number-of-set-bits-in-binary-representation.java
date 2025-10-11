class Solution {
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int cntSetBit = countSetBit(i);
            if (isPrime(cntSetBit))
                count++;
        }
        return count;
    }
}