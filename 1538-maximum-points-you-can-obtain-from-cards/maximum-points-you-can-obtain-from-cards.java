class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[] dp = new int[k + 1];
        
        // Calculate the initial sum for the first k cards from the start
        for (int i = 0; i < k; i++) {
            dp[0] += cardPoints[i];
        }
        
        int maxScore = dp[0];
        
        // Iterate through the array, shifting one card from the start to the end
        for (int i = 1; i <= k; i++) {
            dp[i] = dp[i - 1] - cardPoints[k - i] + cardPoints[n - i];
            maxScore = Math.max(maxScore, dp[i]);
        }
        
        return maxScore;
    }
}
