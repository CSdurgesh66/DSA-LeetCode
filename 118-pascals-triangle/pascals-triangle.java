class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        if(n==1){
            return ans;
        }
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        prev.add(1);
        ans.add(prev);
        for(int i=2;i<n;i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j=0;j<prev.size()-1;j++){
                l.add(prev.get(j) + prev.get(j+1));
            }
            l.add(1);
            ans.add(l);
            prev = l;
        }


        return ans; 
    }
}