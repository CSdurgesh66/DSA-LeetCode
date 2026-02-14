class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        int n = s.length();
        for(int i=0;i<=n-10;i++){

            String str = s.substring(i,i+10);

            if(!seen.add(str)){
                repeated.add(str);
            }
        }

        return new ArrayList<>(repeated);
    }
}