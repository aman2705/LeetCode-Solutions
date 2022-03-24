class Solution {
    public int numDecodings(String n) {
        int len=n.length();
		int []dp=new int[len+1];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
		char ch[]=n.toCharArray();
		int ans=memo(dp,n,len);
		return ans;
    }
    private static int memo(int dp[],String n,int index)
	{
		if(index==0)
		{
			return dp[index]=1;
		}
		else if (index<0)
			return 0;
		
		
		if(dp[index]!=-1)
			return dp[index];
			
		int left=0;
		if(n.charAt(index-1)!='0')
			left=memo(dp,n,index-1);
		
		int right=0;
		if(index>1)
		{
			int ans=Integer.parseInt(n.substring(index-2, index));
			if(ans>=10 && ans<=26)
				right=memo(dp,n,index-2);
		}
		return dp[index]=left+right;
	}
}