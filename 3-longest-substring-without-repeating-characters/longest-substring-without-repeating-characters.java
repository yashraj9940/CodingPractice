class Solution {
    public int lengthOfLongestSubstring(String s) {
     char[] a=s.toCharArray();
     Map<Character,Integer> hm=new HashMap<>();
     Integer ml=0;
     for(int i=0;i<a.length;i++){
      
        if(hm.getOrDefault(a[i],-11)==-11){
            hm.put(a[i],i);
        
      
        }
        else{
            ml=ml>hm.size()?ml:hm.size();
            i=hm.get(a[i]);
            hm.clear();
      
            
        }
     }


   return ml>hm.size()?ml:hm.size();
}
}