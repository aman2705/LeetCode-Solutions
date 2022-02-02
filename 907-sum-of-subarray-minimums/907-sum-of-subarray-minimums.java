class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<int[]> st= new Stack<>();
        Stack<int[]> st1=new Stack<>();
        long res = 0, mod = (long)1e9 + 7;
        int right[]=new int[arr.length];
        int left[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            while(!st.isEmpty() && st.peek()[0]>arr[i])
                count=count+st.pop()[1];
            
            st.push(new int[]{arr[i],count});
            right[i]=count;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            int count=1;
              while(!st1.isEmpty() && st1.peek()[0]>=arr[i])
                count=count+st1.pop()[1];
            
            st1.push(new int[]{arr[i],count});
            left[i]=count;
        }
      
        for(int i=0;i<arr.length;i++)
        {
          res= (res + (long)arr[i] * left[i] * right[i]) % mod;
        }
        return (int)res;        
    }
}