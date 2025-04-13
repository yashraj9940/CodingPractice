class Solution {
    public int mySqrt(int x) {
        int s = 0;
        for (int i = 1; i * 1l * i <= x; i++) { 
            s = i;
        }
        return s;
    }
}