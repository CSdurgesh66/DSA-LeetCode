class Solution {
    public int minOperations(String s) {
        int eo = 0, oo = 0, ez = 0, oz = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (i % 2 == 0) eo++;
                else oo++;
            } else {
                if (i % 2 == 0) ez++;
                else oz++;
            }
        }
        return Math.min(eo + oz, ez + oo);
    }
}