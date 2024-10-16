class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(i==j)
                continue;
                sum=nums[i]+nums[j];
                if(sum==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
            }
        }
    }
    return a;
}
}