class Solution {
    public int longestPalindromeSubseq(String s) {
     
        int index1=s.length();
        int index2=s.length();
        int dp[][]=new int[index1][index2];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        StringBuilder sb=new StringBuilder(s);
        char ch[]=s.toCharArray();
        char ch2[]=sb.reverse().toString().toCharArray();
       int ans= solve(dp,index1-1,index2-1,ch,ch2);
        return ans;
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