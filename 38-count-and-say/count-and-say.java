class Solution {
    public StringBuilder create(StringBuilder s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else {
                sb.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length()-1));
        return sb;
    }
    public String countAndSay(int n) {
       StringBuilder res =new StringBuilder("1");
       for(int i=1;i<n;i++){
         res = create(res);
       }
       
       return res.toString();
    }
}