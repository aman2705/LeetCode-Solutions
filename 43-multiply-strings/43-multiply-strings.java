class Solution {
    public String multiply(String num1, String num2) {
        //created a res array of 
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        
        int res[]=new int[num1.length()+num2.length()];
        int pf=0;
        int i=num2.length()-1;
        while(i>=0)
        {
            int ival=num2.charAt(i)-'0';
            i--;
            
            int j=num1.length()-1;
            int carry=0;
            int k=res.length-1-pf;
            
            while(j>=0 || carry!=0){
               
                int jval=j>=0 ? num1.charAt(j)-'0':0;
                j--;
                
                int prod=jval*ival+carry+res[k];
                res[k]=prod%10;
                carry=prod/10;
                k--;
                
                
            }
            pf++;
        }
        String str="";
        boolean flag=false;
        for(i=0;i<res.length;i++)
        {
            if(res[i]==0 && flag==false)
            {
                continue;
            }
            else
            {
                flag=true;
                str=str+res[i];
            }
               
        }
        return str;
    }
}