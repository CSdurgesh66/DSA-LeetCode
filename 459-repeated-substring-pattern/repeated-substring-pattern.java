class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String dub = s+s;
       return dub.substring(1,dub.length()-1).contains(s);
    }
}