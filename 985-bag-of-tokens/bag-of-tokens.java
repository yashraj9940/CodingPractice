class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        Arrays.sort(token);
        int i=0,j=token.length-1,maxS=0,s=0;
        while(i<=j){
            if(token[i]<=power){
                power=power-token[i++];
                s++;
                maxS=maxS>s?maxS:s;
            }
            else if(s>0){
                power=power+token[j--];
                s--;
            }
            else
                return maxS;

        }
    return maxS;
        
    }
}