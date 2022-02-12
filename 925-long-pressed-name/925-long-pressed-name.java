class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
         if(name.equals(typed)) return true;
        if(name.length() > typed.length()) return false;
        
        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length())
        {
            char a=name.charAt(i);
            char b=typed.charAt(j);
            
            if(a!=b)
                return false;
            
            while(i<name.length() && j<typed.length() && name.charAt(i)==a && typed.charAt(j)==b)
            {
                i++;
                j++;
            }
           while(j<typed.length() && typed.charAt(j)==b)
               j++;
        }
        
        if(i<name.length() && j==typed.length() || i==name.length() && j<typed.length())
            return false;
        
        return true;
    }
}