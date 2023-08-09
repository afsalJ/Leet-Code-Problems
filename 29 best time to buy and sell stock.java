class Solution {
    public int maxProfit(int[] prices) {
        int overallProfit=0;
        int profitToday=0;
        int leastValue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(leastValue>prices[i]){
                leastValue=prices[i];
            }
            profitToday=prices[i]-leastValue;
            if(profitToday>overallProfit){
                overallProfit=profitToday;
            }
        }
        return overallProfit;
    }
}