class Solution {
    public int minPathSum(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return minimum(n-1,m-1,dp,grid);
    }
    private static int minimum(int i,int j,int dp[][],int grid[][])
    {
        
        if(i==0 && j==0)
            return grid[0][0];
        
        if(i<0 || j<0)
            return (int)Math.pow(10,9);
        
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int left=grid[i][j]+minimum(i,j-1,dp,grid);
        int up=grid[i][j]+minimum(i-1,j,dp,grid);
        
        return dp[i][j]=Math.min(left,up);
    }
}