class Solution {
    private int maxlen= 1;
    private int start=-1;
    private int end=-1;
    public String longestPalindrome(String s) {
        if(s.length()==1)
            return s;
        
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        solve(dp,0,s.length()-1,s);
       if(maxlen == 1)
            return s.substring(0,1);
        return s.substring(start, end+1);
        
    }
    private int solve(int [][]dp,int low,int high,String s)
    {
        if(low>high)
            return 0;
        if(low==high)
            return 1;
        if(dp[low][high]!=-1)
            return dp[low][high];
        if(s.charAt(low)==s.charAt(high))
        {
            boolean b=check(s,low+1,high-1);
            if(b==true)
            {
                 dp[low][high]=high-low+1;
                if(dp[low][high]>maxlen)
                {
                    maxlen=dp[low][high];
                    start=low;
                    end=high;
                }
                return dp[low][high];
            }
               
        }
       
            dp[low][high]=Math.max(solve(dp,low+1,high,s),
                                  solve(dp,low,high-1,s));
            return dp[low][high];
        
    }
    private static boolean check(String s,int low,int high)
    {
        while(low<=high)
        {
            if(s.charAt(low)==s.charAt(high))
            {
                low++;
                high--;
            }
            else
            {
                break;
            }
        }
        if(low>high)
            return true;
        else
            return false;
    }
}