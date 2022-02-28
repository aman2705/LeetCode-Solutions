class Solution {
    public int minSwaps(String s) {
        if(s.length()%2==0)
            return foreven(s);
        else
            return forodd(s);
    }
    private static int forodd(String s)
	{
		int countof1=0;
		int countof0=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='0')
				countof0++;
			else
				countof1++;
		}
        if (countof1 > countof0 + 1 ||countof0> countof1 + 1)
		    return -1;
        
		if(countof1>countof0)
		{
			int n=s.length();
			StringBuilder sb1=new StringBuilder();
			for(int i=0;i<n;i++)
			{
				if(i%2==0)
					sb1.append(1);
				else
					sb1.append(0);
			}
			String s1=sb1.toString();
			int count1=0;
			for(int i=0;i<n;i++)
			{
				Character ch=s.charAt(i);
				Character ch1=s1.charAt(i);
				boolean res =ch.equals(ch1);
				  if(res==false)
				  {
					  count1++;
				  }
			}
			return count1/2;
		}
		else
		{
			int n=s.length();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<n;i++)
			{
				if(i%2==0)
					sb.append(0);
				else
					sb.append(1);
			}
			int count1=0;
			String s1=sb.toString();
			for(int i=0;i<n;i++)
			{
				Character ch=s.charAt(i);
				Character ch1=s1.charAt(i);
				boolean res =ch.equals(ch1);
				  if(res==false)
				  {
					  count1++;
				  }
			}
			return count1/2;
		}
		
	}
    private static int foreven(String s)
    {
		int countof1=0;
		int countof0=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='0')
				countof0++;
			else
				countof1++;
		}
        
		 if(countof0!=countof1)
			return -1;
		
		// what is the string length'
		int n=s.length();
		StringBuilder sb=new StringBuilder();
		// for 1st validString
		StringBuilder sb1=new StringBuilder();
		// for 2nd valid string
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				sb.append(0);
			else
				sb.append(1);
		}
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				sb1.append(1);
			else
				sb1.append(0);
		}
		// System.out.println(sb.toString());
		// System.out.println(sb1.toString());
		int count=0;
		int count1=0;
		// to count how many replacements required for the first string
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			char ch1=sb.charAt(i);
			if(ch!=ch1)
				count++;
//			System.out.println(ch+" "+ch1);
		}
		// to count how many replacements required for the second string
		// System.out.println();
		String s1=sb1.toString();
		for(int i=0;i<n;i++)
		{
			Character ch=s.charAt(i);
			Character ch1=s1.charAt(i);
			boolean res =ch.equals(ch1);
			  if(res==false)
			  {
				  count1++;
				  // System.out.println(ch+" "+ch1);
			  }
		}
		count=count/2;
		count1=count1/2;
		
//		System.out.println(count);
//		System.out.println(count1);
		return (Math.min(count1,count));
	}
}