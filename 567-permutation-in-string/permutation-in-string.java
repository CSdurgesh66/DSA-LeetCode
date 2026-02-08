class Solution {

    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int n1 = s1.length();

        for (int r = 0; r < s2.length(); r++) {
            
            char rc = s2.charAt(r);
            map.put(rc, map.getOrDefault(rc, 0) + 1);
            
            if (r - l + 1 > n1) {
                char lc = s2.charAt(l);
                map.put(lc, map.get(lc) - 1);
                if (map.get(lc) == 0) {
                    map.remove(lc);
                }
                l++;
            }
            if (r - l + 1 == n1) {
                HashMap<Character, Integer> temp = new HashMap<>(map);
                boolean matched = true;
                for (int i = 0; i < s1.length(); i++) {
                    char ch = s1.charAt(i);

                    if (!temp.containsKey(ch)) {
                        matched = false;
                        break;
                    }

                    temp.put(ch, temp.get(ch) - 1);
                    if (temp.get(ch) == 0) {
                        temp.remove(ch);
                    }
                }

                if (matched) return true;
            }
        }

        return false;
    }
}
