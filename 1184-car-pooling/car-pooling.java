class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] roads = new int[1001];

        for(int[] trip:trips){
            int passengers = trip[0];
            int st = trip[1];
            int end = trip[2];


            for(int i=st;i<end;i++){
                roads[i] += passengers;

                if(roads[i]>capacity){
                    return false;
                }
            }
        }

        return true;
    }
}