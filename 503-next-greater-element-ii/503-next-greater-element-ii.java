class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            st.push(nums[i]);
        }
        int ans[]=new int[nums.length];
        for(int i=ans.length-1;i>=0;i--)
        {
            if(nums[i]>=st.peek())
            {
                while(!st.isEmpty() && nums[i]>=st.peek())
                {
                    st.pop();
                }
            }
            
            if(st.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }
}