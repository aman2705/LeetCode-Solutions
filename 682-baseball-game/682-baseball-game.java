class Solution {
    public int calPoints(String[] ops) {
       Stack<Integer> st=new Stack<>();
		for(int i=0;i<ops.length;i++)
		{
			String s=ops[i];
			
			 if(s.equals("C") && st.size()>=1)
			{
				// System.out.println(st.pop()); 
                 st.pop();
				
			}
			else if(s.equals("D")&& st.size()>=1)
			{
				int a=st.pop();
				int c=a*2;
				// System.out.println(a);
				// System.out.println(c);
				st.push(a);
				st.push(c);
			}
			else if(s.equals("+") && st.size()>=2)
			{
				int a=st.pop();
				int b=st.pop();
				int c=a+b;
				// System.out.println(a);
				// System.out.println(b);
				// System.out.println(c);
				st.push(b);
				st.push(a);
				st.push(c);
			}
			else
			{
				// System.out.println(ops[i]);
				st.push(Integer.parseInt(s));
			}
		}
		int res=0;
		while(!st.isEmpty())
		{
//			System.out.println(st.peek());
			res=res+st.pop();
			
		}
		// System.out.println(res);
        return res;
    }
}