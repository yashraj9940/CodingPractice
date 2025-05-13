class Solution {
    public boolean check(int[] nums) {
        int inc=0,dec=0;
        int max=1000;
        int l=nums.length;
        if(l<=1)
            return true;
        for(int i=1;i<l;i++){
            if(nums[i]>max)
                return false;
            
            if(!(nums[i-1]<=nums[i])){
                     
                    max=nums[0];
                      if(nums[i]>max)
                             return false;
                dec++;
            }
        }
        if(dec<=1)
        return true;

        return false;
        
        
    } // 33333345012
}