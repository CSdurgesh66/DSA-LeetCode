class Solution {
    public long maxWeight(int[] pizzas) {
        int n = pizzas.length;
        int days = n/4;
        int odd = (days+1)/2 , even = days/2;
        Arrays.sort(pizzas);

        long ans = 0;
        int i= n-1;

        for(int j=1;j<=odd;j++){
            ans += pizzas[i];
            i--;
        }

        for(int j=1;j<=even;j++){
            ans += pizzas[i-1];
            i -= 2;
        }
        return ans;
    }
}