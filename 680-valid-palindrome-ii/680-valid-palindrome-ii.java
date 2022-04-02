class Solution {
    public boolean validPalindrome(String s) {
        char []ch=s.toCharArray();
		int low=0;
		int high=ch.length-1;
		while(low<high)
		{
			if(ch[low]==ch[high])
			{
				low++;
				high--;
			}
			else
			{
				return call(ch,low+1,high)||call(ch,low,high-1);
			}
		}
		return true;
    }
    private static boolean call(char[] ch, int low, int high) {
		// 
		while(low<high)
		{
			if(ch[low]==ch[high])
			{
				low++;
				high--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}