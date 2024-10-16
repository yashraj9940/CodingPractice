class Solution {
    public int findMin(int[] nums) {
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(a>nums[i]){
                return nums[i];
            }

        }
        return a;
        
    }
}

// 6 5 4 3 2 1
//123456
// 3 4 5 1 2