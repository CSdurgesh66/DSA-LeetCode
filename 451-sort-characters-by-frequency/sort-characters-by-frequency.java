class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
       List<Pair> l = new ArrayList<>();
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
        l.add(new Pair(entry.getKey(),entry.getValue()));
       }

       l.sort((a,b) -> b.freq - a.freq);
       StringBuilder sb = new StringBuilder();
       for(Pair p:l){
        sb.append(String.valueOf(p.ch).repeat(p.freq));
       }
        return sb.toString();


    }
}
class Pair{
    char ch;
    int freq;
    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}