class Solution {
    public int trailingZeroes(int n) {
     int ans=0;
     int denominator=5;
     while(n>=denominator){
        ans=ans+n/denominator;
        denominator=denominator*5;
     }   
     return ans;
    }
}