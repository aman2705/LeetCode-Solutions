class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            int curr=asteroids[i];
            
            if(curr>0)
                st.push(curr);
            
            else
            {
                while(!st.isEmpty() && st.peek()>0 && -curr>st.peek())
                    st.pop();
                
                if(st.isEmpty()|| st.peek()<0)
                    st.push(curr);
                
                else if(-curr==st.peek())
                    st.pop();
            }
            
        }
        int ans[]=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
    
}