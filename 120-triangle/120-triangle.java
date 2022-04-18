class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int dp[][]=new int[triangle.size()][triangle.size()];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return solve(0,0,triangle,dp);
    }
    private static int solve(int i,int j,List<List<Integer>> triangle,int [][] dp)
    {
        
        if(i==triangle.size()-1)
            return triangle.get(i).get(j);
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int down=triangle.get(i).get(j)+solve(i+1,j,triangle,dp);
        int diag=triangle.get(i).get(j)+solve(i+1,j+1,triangle,dp);
        
        return dp[i][j]=Math.min(down,diag);
    }
}