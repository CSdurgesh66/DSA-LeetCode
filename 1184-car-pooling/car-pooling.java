class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] changes = new int[1001];

        for(int[] trip:trips){
            int passengers = trip[0];
            int st = trip[1];
            int end = trip[2];

            changes[st] += passengers;
            changes[end] -= passengers;
             
        }

        int total = 0;
        for(int i=0;i<1001;i++){
            total += changes[i];
            if(total>capacity) return false;
        }

        return true;
    }
}