class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()>goal.length() || goal.length()>s.length())
            return false;
        
        if(s.equals(goal))
        {
            HashSet<Character> hm=new HashSet<>();
            for(int i=0;i<s.length();i++)
                hm.add(s.charAt(i));
            return hm.size()<goal.length();
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=goal.charAt(i))
                al.add(i);
        }
        if(al.size()==2)
        {
            if(s.charAt(al.get(0))==goal.charAt(al.get(1)) && goal.charAt(al.get(0))==s.charAt(al.get(1)))
                return true;
            else
                return false;
        }
        return false;
        
        // if(s.equals(goal))
        //     return false;
//         if(s.length()> goal.length() || goal.length()>s.length())
//              return false;  
//         HashMap<Character,Integer> hm=new HashMap<>();
//         HashMap<Character,Integer> hm1=new HashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             hm.put(s.charAt(i),i);
//         }
//         for(int i=0;i<goal.length();i++){
//             hm1.put(goal.charAt(i),i);
//         }
//         if(hm.size()==1 && hm1.size()==1)
//             return true;      
//                
//         for(Character ch:hm.keySet())
//         {
//             if(hm.get(ch)!=hm1.get(ch))
//                 return true;
//         }
//         return false;
    }
}