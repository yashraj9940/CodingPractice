class Solution {
    public boolean validPalindrome(String s) {
      int i=0,j=s.length()-1;
      int u=0;
      while(i<j){
        if(s.charAt(i)!=s.charAt(j)  ){
            return test(s,i+1,j)||test(s,i,j-1);
        }
        else
        {
            i++;j--;
        }

       }
        return true;  
    }


public boolean test(String s,int i,int j){
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)  ){
            return false;
        }
        else
        {
            i++;j--;
        }
}
return true;
}}
