class Solution {
    public String reverseWords(String s) {
        char c[]=s.toCharArray();
        int start=0;
        for(int end=0;end<c.length;end++)
        {
            if(s.charAt(end)==' ')
            {
                reverse(start,end-1,c);
                start=end+1;
            }
        }
        reverse(start,c.length-1,c);
        String str=String.valueOf(c);
        return str;
    }
    private static void reverse(int start,int end,char c[])
    {
        while(start<end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            
            start++;
            end--;
        }
    }
}