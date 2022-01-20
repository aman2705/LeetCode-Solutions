
class Solution {
    public int numSteps(String s) {
      
        int n=s.length();
        int carry=0;
        int count=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i==0 && carry==0 )
                break;
            
            char ch=s.charAt(i);
            int x=ch-48;
            x=x+carry;
            if(x%2==0)
            {
                count++;
                if(x==2){
                    carry=1;
                }
            }
            else
            {
                carry=1;
                count=count+2;
            }
        }
        return count;
    }
}