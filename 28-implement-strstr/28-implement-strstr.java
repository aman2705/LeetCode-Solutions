class Solution {
    public int strStr(String word, String p) {
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
                return i;
            }
        }
        return -1;
    }
}