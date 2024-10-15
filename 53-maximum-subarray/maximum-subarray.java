class Solution {
    public int maxSubArray(int[] nums) {
        int[] prefixArray = new int[nums.length];
        prefixArray[0] = nums[0];
        int maximumSum = prefixArray[0];
        for (int i = 1; i < nums.length; i++) {
            if (prefixArray[i - 1] < 0) {
                prefixArray[i] = nums[i];
            } else {
                prefixArray[i] = prefixArray[i - 1] + nums[i];
            }
            maximumSum = Math.max(maximumSum, prefixArray[i]);
        }

        return maximumSum;
    }
}