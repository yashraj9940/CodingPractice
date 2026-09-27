class Solution {
    public boolean isPalindrome(String s) {
     s=s.replaceAll("[^a-zA-Z0-9]", "").replace(" ","");  
     int i=0;int j=s.length()-1;
     boolean result=true;
     while(i<j){
        char start=s.charAt(i);
        char end=s.charAt(j);
        if(Character.toLowerCase(start)==Character.toLowerCase(end)){
            result=true;
            i++;
            j--;
        }else{
            result=false;
            break;
        }
     } 
     return result;
    }
}