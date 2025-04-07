class Solution {
    public int reverse(int x) {

        long ans=0;
        int sign=1;
        if(x<0)
            sign=-1;

        x=x*sign;
        while(x>0){
            int l=x%10;
            ans=ans*10+l;
            x=x/10;
        }
    
        ans= ans*sign;
       System.out.println(2l<<31); 
     if (ans > ((1L << 31) - 1)) // Integer.MAX_VALUE: (1L << 31) - 1
    return 0;

if (ans < (-(1L << 31))) // Integer.MIN_VALUE: -(1L << 31)
    return 0;
        
        return (int)ans;
    }
}