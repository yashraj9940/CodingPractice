class Solution {
    public int maxProfit(int[] p) {
        int min=p[0];
        int profit=0;
        for(int i=1;i<p.length;i++){
            if(p[i]>min){
              int  new_profit=p[i]-min;
              profit=profit<new_profit?new_profit:profit;
            }
            else
                min=p[i];

        }
        return profit;
        
    }
}