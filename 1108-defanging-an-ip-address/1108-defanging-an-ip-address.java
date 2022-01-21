class Solution {
    public String defangIPaddr(String address) {
      
		 StringBuilder sb=new StringBuilder();
	       
	        for(int i=0;i<address.length();i++)
	        {
	            char ch=address.charAt(i);
	            int ascii=ch;
//	            if(ascii>=48 || ascii<=57)
//	            {
//	                sb.append(ch);
//	            }
//	            else
//	            {
//	            	sb.append("[.]");
//	            }
	            if(ch=='.')
	            {
	            	sb.append("[.]");
	            }
	            else
	            {
	            	sb.append(ch);
	            }
	        }
        return sb.toString();
    }
}