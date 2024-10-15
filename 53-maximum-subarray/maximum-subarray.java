class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
            int sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           cur+=nums[i];
            if(sum<cur){
                sum=cur;
            }
            if(cur<0)
                cur=0;
        }
     return sum;   
    }
}
//[-2,1,-3,4,-1,2,1,-5,4]