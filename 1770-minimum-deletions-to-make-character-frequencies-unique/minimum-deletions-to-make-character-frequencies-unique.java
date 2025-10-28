class Solution {
    public int minDeletions(String s) {
        int[] freq=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;

        }
       Set<Integer> set = new HashSet<>();

    int c=0;

    // method 1
 /*       for(int i=0;i<26;i++){
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
        } */
        // method 2
        Arrays.sort(freq);
        for(int i=24;i>=0;i--){
            if(freq[i]==0)
            break;
            if(freq[i]>=freq[i+1]){
                int old=freq[i];
                int newF=Math.max(freq[i+1]-1,0);
                c+=old-newF;
                freq[i]=newF;
            }
        }

        for(int i=25;i>=0;i--)
        System.out.println(freq[i]);

        return c;
    }
}