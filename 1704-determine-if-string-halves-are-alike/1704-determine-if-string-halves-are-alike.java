class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int count=0;
        int count1=0;
        for(int i=0;i<s.length()/2;i++)
        {
            char c=s.charAt(i);
            int ch=c;
             if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117)      
                 count++;
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            char c=s.charAt(i);
            int ch=c;
             if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117)      
                 count1++;
        }
        if(count1==count)
            return true;
        else
            return false;
    }
}