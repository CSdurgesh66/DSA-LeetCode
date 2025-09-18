class Solution {
    public boolean isIsomorphic(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        if (lens != lent) return false;
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < lens; i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (mapS[chS] != mapT[chT]) return false;
            mapS[chS] = i + 1;
            mapT[chT] = i + 1;
        }

        return true;
    }
}