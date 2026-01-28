class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int i = 0 , j = n-1;
        while(i<j){
            int w = j - i;
            int h = Math.min(height[i],height[j]);
            int area = h * w;
            maxArea = Math.max(maxArea,area);
            if(height[i]>=height[j]) j--;
            else i++;
        }
        return maxArea;
    }
}