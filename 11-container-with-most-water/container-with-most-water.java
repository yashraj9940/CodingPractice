class Solution {
    public int maxArea(int[] height) {
       int i = 0;
        int j = height.length - 1;
        int min, max=0;
        while(i<j){
            min = Math.min(height[i],height[j]);
            max = Math.max(min * (j-i),max);
            while(i<j && height[i] <= min) i++;
            while(i<j && height[j] <= min) j--;
        }
        return max;
    }
}