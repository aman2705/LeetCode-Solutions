class Solution {
    public boolean areAlmostEqual(String s, String goal) {
        if(s.length()>goal.length() || goal.length()>s.length())
            return false;
        
        if(s.equals(goal))
            return true;
        
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
    }
}