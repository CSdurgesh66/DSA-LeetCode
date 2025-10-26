class Solution {
    public int repeatedStringMatch(String a, String b) {
        String original = a;
        int count = 1;
        while(a.length() < b.length()){
            count++;
            a += original;
        }
        if(a.indexOf(b)!=-1) return count;
        a += original;
        if (a.indexOf(b) != -1) return count + 1;
        
        return -1;
    }
}