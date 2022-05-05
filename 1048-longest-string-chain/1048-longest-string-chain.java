class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)-> a.length()-b.length());
       // System.out.println(Arrays.toString(words));
        int dp[]=new int[words.length];
        int max=1;
        for(int i=0;i<words.length;i++)
        {
            dp[i]=1;
            for(int prev=0;prev<i;prev++)
            {
                if(compare(words[i],words[prev]) && dp[i]<dp[prev]+1)
                {
                    dp[i]=dp[prev]+1;
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
    private static boolean compare(String s1,String s2)
    {
        if(s1.length() !=s2.length()+1)
            return false;
        
        int i=0;
        int j=0;
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        while(i<ch1.length)
        {
            if(j<ch2.length && ch1[i]==ch2[j])
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
            
        }
        if(i==ch1.length && j==ch2.length)
            return true;
        else
            return false;
    }
}