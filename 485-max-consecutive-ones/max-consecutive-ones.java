class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur=0,max=0;
        for(int i:nums){
            if(i==1){
                cur++;
                if(max<cur){
                    max=cur;
                }
            }
            else
            cur=0;
        }
        return max;
        
    }
}