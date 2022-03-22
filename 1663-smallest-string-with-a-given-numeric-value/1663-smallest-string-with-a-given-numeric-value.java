class Solution {
    public String getSmallestString(int n, int k) {
       
        char arr[]=new char[n];
		Arrays.fill(arr, 'a');
		k=k-n;
		n=n-1;
		while(k>0 && n>=0)
		{
			if(k>25)
			{
				arr[n]='z';
				k=k-25;
				n--;
			}
			else
			{
				int res=k;
				arr[n]=(char) ('a'+res);
				break;
			}
		}
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
            sb.append(arr[i]);
        
        return sb.toString();
    }
}