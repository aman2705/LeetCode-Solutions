class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        int ans=1_000_000;
        for(int j=0;j<dp[0].length;j++)
        {
            int min=solve(matrix.length-1,j,matrix,dp);
            ans=Math.min(ans,min);
        }
        return ans;
        
    }
    private static int solve(int i,int j,int[][] matrix,int [][] dp)
    {
        if(j<0 || j>=dp[0].length)
            return 1_000_000_000;
        
        if(i==0)
            return matrix[0][j];
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int up=matrix[i][j]+solve(i-1,j,matrix,dp);
        int leftdiag=matrix[i][j]+solve(i-1,j-1,matrix,dp);
        int rightdiag=matrix[i][j]+solve(i-1,j+1,matrix,dp);
        
        return dp[i][j]=Math.min(up,Math.min(leftdiag,rightdiag));
    }
}