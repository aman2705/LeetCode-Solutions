class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int index1=text1.length();
        int index2=text2.length();
        int dp[][]=new int[index1][index2];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        char ch[]=text1.toCharArray();
        char ch2[]=text2.toCharArray();
        return solve(dp,index1-1,index2-1,ch,ch2);
        
    }
    private static int solve(int [][]dp,int index1,int index2,char ch[],char ch2[])
    {
        if(index1<0 || index2<0)
            return 0;
        
        if(dp[index1][index2]!=-1)
            return dp[index1][index2];
        
        if(ch[index1]==ch2[index2])
            return dp[index1][index2]=1+solve(dp,index1-1,index2-1,ch,ch2);
        else
            return dp[index1][index2]=Math.max(
            solve(dp,index1-1,index2,ch,ch2),
            solve(dp,index1,index2-1,ch,ch2)
        );
    }
}