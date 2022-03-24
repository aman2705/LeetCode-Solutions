class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        int dp[]=new int[n];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
		int res=compute(n-1,dp,cost);
		int res1=compute(n-2,dp,cost);
        return Math.min(res,res1);
    }
    private static int compute(int n,int []dp,int cost[])
	{
		if(n==0 || n==1)
			return dp[n]=cost[n];
		
		else if(n<0)
			return (int)Math.pow(10,9);
		
		if(dp[n]!=-1)
			return dp[n];
		
		
		return dp[n]=cost[n]+Math.min(compute(n-1,dp,cost),compute(n-2,dp,cost));
	}
}