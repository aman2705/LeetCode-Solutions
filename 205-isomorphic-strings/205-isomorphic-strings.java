class Solution {
    public boolean isIsomorphic(String s, String t) {
       
       return helper(s,t) && helper(t,s);
        
    }
    private static boolean helper(String s,String t)
    {
         HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                if(hm.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            
            hm.put(s.charAt(i),t.charAt(i));
        }
       return true;
    }
}