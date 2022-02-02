class Solution {
    public boolean find132pattern(int[] nums) {
        int min[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        int small=nums[0];
        min[0]=nums[0];
        for(int i=1;i<min.length;i++)
        {
            min[i]=Math.min(nums[i],min[i-1]);
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && min[i]>=st.peek())
                st.pop();
            
            if(!st.isEmpty() && nums[i]>st.peek())
                return true;
            
            st.push(nums[i]);
        }
        return false;
    }
}