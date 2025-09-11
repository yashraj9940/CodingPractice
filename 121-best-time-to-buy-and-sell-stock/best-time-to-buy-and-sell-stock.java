class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=1000001;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else{
                max=max>(prices[i]-min)?max:(prices[i]-min);
            }
        }

         return max;      
    }
}