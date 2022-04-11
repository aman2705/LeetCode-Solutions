class Solution {
    public int maxProfit(int[] prices, int fee) {
         int dp[][]=new int[prices.length][2];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return solve(0,1,dp,prices,fee);
    }
    private static int solve(int index,int buy,int dp[][],int prices[],int fee)
    {
        if(index==prices.length)
            return 0;
        
        if(dp[index][buy]!=-1)
            return dp[index][buy];
        
        int profit=0;
        if(buy==1)
        {
          profit=Math.max(-prices[index]+solve(index+1,0,dp,prices,fee),
                          0+solve(index+1,1,dp,prices,fee)
                         );
        }
        else
        {
           profit=Math.max(-fee+prices[index]+solve(index+1,1,dp,prices,fee),
                          0+solve(index+1,0,dp,prices,fee)
                         )  ; 
        }
        return dp[index][buy]=profit;
        
    }
}