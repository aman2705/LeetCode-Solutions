class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
	int start=0;
		
		for(int i=0;i<pushed.length;i++)
		{
			st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[start])
            {
                st.pop();
                start++;
            }
		}
        while(start<popped.length)
        {
            if(popped[start]!=st.peek())
                return false;
            st.pop();
            start++;
        }
        return true;
    }
    
}