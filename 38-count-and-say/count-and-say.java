class Solution {
    public StringBuilder create(StringBuilder s){
        int curr = 0, prev= 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(curr<s.length()){
            if(s.charAt(curr)==s.charAt(prev)){
                curr++;
                count++;
            }else{
                sb.append(count);
                sb.append(s.charAt(prev));
                prev = curr;
                count = 0;
            }
        }
        sb.append(count);
        sb.append(s.charAt(prev));

        return sb;
    }
    public String countAndSay(int n) {
       if(n==1) return "1";
       StringBuilder res =new StringBuilder("1");
       for(int i=2;i<=n;i++){
         res = create(res);
       }
       
       return res.toString();
    }
}