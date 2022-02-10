class Solution {
    public int numberOfSubstrings(String str) {
     
       int a = 0, b = 0, c = 0;

       
		int ans = 0;
		int len = str.length();
		int low = 0;
		int high= 0;
		for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                a++;
            }
            else if(str.charAt(i)=='b')
            {
                b++;
            }
            else
            {
                c++;
            }
            while(a>0 && b>0 && c>0)
            {
                ans=ans+(len-i);
                 if(str.charAt(low)=='a')
                {
                    a--;
                }
                else if(str.charAt(low)=='b')
                {
                    b--;
                }
                else
                {
                    c--;
                }  
                low++;
            }
        }

		return ans;
    }
}