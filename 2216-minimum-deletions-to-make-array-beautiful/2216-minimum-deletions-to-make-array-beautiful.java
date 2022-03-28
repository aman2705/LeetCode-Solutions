class Solution {
    public int minDeletion(int[] arr) {
       if(arr.length==1)
           return 1;
        
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
            st.push(arr[i]);
        int count=0;
        while(st.size()>1)
        {
            int a=st.pop();
            int b=st.pop();
            if(a==b)
            {
                st.push(b);
                count++;
            }
        }
        if(st.size()%2==1)
            return count+1;
        return count;
            
    }
}