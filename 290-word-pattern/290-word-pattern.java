class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> hm=new HashMap<>();
        HashMap<String,Boolean> hm1=new HashMap<>();
        String str[]=s.split(" ");
        if(pattern.length()!=str.length)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String st=str[i];
            
            if(hm.containsKey(ch))
            {
                if(hm.get(ch).equals(st)==false)
                    return false;
            }
            else
            {
               if(hm1.containsKey(st)==true)
                   return false;
                else
                {
                    hm.put(ch,st);
                    hm1.put(st,true);
                }
            }
        }
        return true;
    }
}