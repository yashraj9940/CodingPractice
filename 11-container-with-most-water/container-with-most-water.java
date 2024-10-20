class Solution {
    public int maxArea(int[] h) {
        int len=h.length;
        int l=0;
        int r=len-1;
        int max=0;
        while(l<r){
            int min=Math.min(l,r);
             max=Math.max(max,Math.min(h[l],h[r])*(r-l));
            if(h[l]>h[r])
                r--;
            else
                l++;
        }
        return max;
    }
}