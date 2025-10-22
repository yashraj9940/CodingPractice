class Solution {
    public int numRescueBoats(int[] p, int l) {
        Arrays.sort(p);
        int n=0,prev=0;
       int i=0,j=p.length-1,b=0;
       while(i<=j){
        if( p[i]+p[j]<=l )
        {    i++;
            j--;
            b++;
        }
       else
      { b++;
      j--;}
       }
       return b;
    }
}