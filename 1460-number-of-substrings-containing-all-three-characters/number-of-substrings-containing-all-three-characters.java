class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        Integer ar[]={-1,-1,-1};
        int i=0;
        while(i<s.length()){
            ar[s.charAt(i)-'a']=i;
             int min = Collections.min(Arrays.asList(ar));
            if(min>=0){
                ans+=min+1;
            }
            i++;
        }
        return ans;
        
        
    }
}