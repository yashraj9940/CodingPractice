class Solution {
    public int minDeletions(String s) {
        int[] freq=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;

        }
       Set<Integer> set = new HashSet<>();

    int c=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0)
                continue;
            if(set.contains(freq[i])){
                freq[i]--;
                c++;
                i--;
            }
            else
            {
               set.add(freq[i]); 
            }
        }
        return c;
    }
}