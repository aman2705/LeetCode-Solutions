class Solution {
    public int numOfStrings(String[] patterns, String word) {
       
        int count=0;
        for(int i=0;i<patterns.length;i++)
        {
            String res=patterns[i];
            int re=substring(res,word);
            if(re!=-1)
            {
                count++;
            }
        }
        return count;
    }
    private static int substring(String p,String word)
    {
        int n=p.length();
        int m=word.length();
        for(int i=0;i<=m-n;i++)
        {
            int j;
            for(j=0;j<n;j++)
            {
                if(p.charAt(j)!=word.charAt(i+j))
                    break;
            }
            if(j==n)
            {
                return 0;
            }
        }
        return -1;
    }
}