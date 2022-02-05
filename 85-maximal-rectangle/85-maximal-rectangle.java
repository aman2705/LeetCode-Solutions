class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix[0].length;
        int height[]=new int[n];
        for(int i=0;i<n;i++)
        {
            height[i]=matrix[0][i]-'0';
        }
        int area=largestRectangleArea(height);
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]-'0'==1)
                {
                    height[j]=height[j]+1;
                }
                else
                {
                    height[j]=0;
                }
            }
            area=Math.max(area,largestRectangleArea(height));
        }
        return area;
        
    }
     public int largestRectangleArea(int[] a) {
        Stack<Integer> st=new Stack<>();
		int ans[]=new int[a.length];
		
		ans[0]=0;
		st.push(0);
		for(int j=1;j<a.length;j++)
		{
			while(st.size()!=0 && a[j]<=a[st.peek()])
			{
				st.pop();
			}
			if(st.size()==0)
			{
				ans[j]=0;
			}
			else
			{
				ans[j]=st.peek()+1;
			}
			st.push(j);
		}

		Stack<Integer> smr=new Stack<>();
		int res[]=new int[a.length];
		res[a.length-1]=a.length-1;
		smr.push(a.length-1);
		for(int i=a.length-1;i>=0;i--)
		{
			while(smr.size()>0 && a[i]<=a[smr.peek()])
			{
				smr.pop();
			}
			if(smr.size()==0)
			{
				res[i]=a.length-1;
			}
			else
			{
				res[i]=smr.peek()-1;
			}
			smr.push(i);
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int tot=(res[i]-ans[i]+1)*a[i];
			if(tot>max)
			{
				max=tot;
			}
			
		}
		return max;
    }
}