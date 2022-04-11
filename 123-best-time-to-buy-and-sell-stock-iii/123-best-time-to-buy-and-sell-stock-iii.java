class Solution {
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length][2][3];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
               for(int k=0;k<dp[i][j].length;k++)
               {
                   dp[i][j][k]=-1;
               }
            }
        }
        return solve(0,1,2,dp,prices);
    }
    private static int solve(int index,int buy,int cap,int dp[][][],int prices[])
    {
        if(index==prices.length || cap==0)
            return 0;
        
        if(dp[index][buy][cap]!=-1)
            return dp[index][buy][cap];
        
        int profit=0;
        if(buy==1)
        {
          profit=Math.max(-prices[index]+solve(index+1,0,cap,dp,prices),
                          0+solve(index+1,1,cap,dp,prices)
                         );
        }
        else
        {
           profit=Math.max(prices[index]+solve(index+1,1,cap-1,dp,prices),
                          0+solve(index+1,0,cap,dp,prices)
                         )  ; 
        }
        return dp[index][buy][cap]=profit;
        
    }
}