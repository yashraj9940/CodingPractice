class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int suffix = 1;
        result[0] = 1;

        //parse and calculate left to right prefix values
        for(int i = 1;i<nums.length;i++){
            result[i] = result[i-1]*nums[i-1];
        }

        //parse and get the values of from right to left
        for(int i = nums.length-1;i>=0;i--){
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }
}