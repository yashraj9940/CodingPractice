class Solution {
    public int minCost(String colors, int[] neededTime) {
        int prev=0,t=0;
        for(int i=0;i<neededTime.length;i++){
            if(i>0 && colors.charAt(i)!=colors.charAt(i-1)){
                prev=0;
            }
            t=t+((prev>neededTime[i])?neededTime[i]:prev);
            prev=(prev<neededTime[i])?neededTime[i]:prev; 

        }
        return t;
        
    }
}