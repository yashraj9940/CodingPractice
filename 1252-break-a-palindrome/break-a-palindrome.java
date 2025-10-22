class Solution {
    public String breakPalindrome(String p) {
        int l=p.length();
        if(l==1)
        return "";
        StringBuilder sb = new StringBuilder(p);
        int m=(l/2)-1;
        for(int i=0;i<=m;i++){
            if(p.charAt(i)!='a')
            {
             
                 sb.setCharAt(i, 'a');
                return sb.toString();

            }
        }
         sb.setCharAt(l-1, 'b');
        return sb.toString();
        
    }
}