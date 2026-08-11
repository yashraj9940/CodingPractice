class Solution {
    public boolean isPalindrome(String s) {
      if(s.length()<=1)
         return true; 
      int i=0,j=s.length()-1;
      while(i<j){
        if(!valid(s.charAt(i)))
        {
            i++;
            continue;
        } if(!valid(s.charAt(j)))
        {
            j--;
            continue;
        }
        if(!(s.charAt(i)+"").equalsIgnoreCase(s.charAt(j)+""))
            return false;
        i++;j--;
      } 
      return true;

    }

    public boolean valid(char a){
        if((a>='a' && a<='z')||(a>='A' && a<='Z')||(a>='0' && a<='9'))
            return true;

        return false;

    }
}