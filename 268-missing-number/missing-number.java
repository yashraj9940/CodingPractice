class Solution {
    public int missingNumber(int[] arr) {
         int n=arr.length;
     
    
      int f=n*(n+1)/2;
      for(int i:arr){
         f=f-i;
      } 
      return f; 
    }
}