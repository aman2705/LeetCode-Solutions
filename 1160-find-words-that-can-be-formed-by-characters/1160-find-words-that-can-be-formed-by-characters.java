class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<chars.length();i++)
        {
            char ch=chars.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            boolean b=true;
            for(Character ch:map.keySet())
            {
                if(hm.containsKey(ch) && hm.get(ch)>=map.get(ch))
                {
                    b=true;
                }
                else
                {
                    b=false;
                    break;
                }
            }
            if(b==true)
                count=count+s.length();
        }
        return count;
    }
}