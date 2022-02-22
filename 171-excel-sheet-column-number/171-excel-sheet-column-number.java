class Solution {
    public int titleToNumber(String s) {
        int start=0;
		int total=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			int index=ch-64;
			int res=1;
			for(int j=0;j<start;j++)
			{
				res=res*26;
			}
			total=total+res*index;
			start++;
		}
        return total;
    }
}