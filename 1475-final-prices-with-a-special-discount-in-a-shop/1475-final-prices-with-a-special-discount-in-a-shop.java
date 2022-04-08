class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
		ans[ans.length-1]=prices[ans.length-1];
		Stack<Integer> st=new Stack<>();
		st.push(ans[ans.length-1]);
		for(int i=ans.length-2;i>=0;i--) {
			
			if(st.peek()>prices[i])
			{
				while(!st.isEmpty() && st.peek()>prices[i])
					st.pop();
			}
			if(st.isEmpty())
				ans[i]=prices[i];
			else
				ans[i]=prices[i]-st.peek();
			st.push(prices[i]);
		}
        return ans;
    }
}