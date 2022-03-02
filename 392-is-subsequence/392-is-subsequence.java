class Solution {
    public boolean isSubsequence(String s, String t) {
       
        if(s.length()==0)
            return true;
        
        if(s.length()>t.length())
            return false;
        
        
       
        int start=0;
        for(int i=0;i<t.length();i++)
        {
            if(start<s.length() && t.charAt(i)==s.charAt(start) )
                start++;
        }
        return start==s.length();
    }
}