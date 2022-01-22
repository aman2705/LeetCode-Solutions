class Solution {
    public int countMatches(List<List<String>> items, String rulekey, String rulevalue) {
        
        if(rulekey.equals("color"))
        {
            int count=0;
        
            for(int i=0;i<items.size();i++)
            {
                String s=items.get(i).get(1);
                if(s.equals(rulevalue))
                {
                    count++;
                }
            }
            return count;
        }
        else if(rulekey.equals("type"))
        {
            int count=0;
            for(int i=0;i<items.size();i++)
            {
                String s=items.get(i).get(0);
                if(s.equals(rulevalue))
                {
                    count++;
                }
            }
            return count;
        }   
        else
        {
            int count=0;
            for(int i=0;i<items.size();i++)
            {
                String s=items.get(i).get(2);
                if(s.equals(rulevalue))
                {
                    count++;
                }
            }
            return count;
        }
        
    }
}