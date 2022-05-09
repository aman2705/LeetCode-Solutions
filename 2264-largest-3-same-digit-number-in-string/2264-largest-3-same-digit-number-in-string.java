class Solution {
    public String largestGoodInteger(String s) {

	    String res="";
		for(int i=0;i<s.length()-2;i++)
	        {
	            StringBuilder sb=new StringBuilder ();
	            boolean b=true;
	            for(int j=0;j<3;j++)
	            {
	                if(s.charAt(i+j)!=s.charAt(i))
	                {
	                    b=false;
	                    break;
	                }
	            }
	            
	            if(b==true)
	            {
	              for(int k=0;k<3;k++)
	                    sb.append(s.charAt(i));  
	            }
            
                String num=sb.toString();
//             if(num!="")
//                 System.out.println(num);
            
	            if(num!=""  &&   num.compareTo(res)>=1)
	            {
                   // System.out.println(res+" "+num);
	            	res=num;
	            }
        }
        return res;
    }
}