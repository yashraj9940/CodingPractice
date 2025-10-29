class Solution {
    public int smallestNumber(int n) {
        int a = 1, i = 1;
        while (a < n) {
            a += (int) Math.pow(2, i);
            i++;
        }
        return a;
    }
}