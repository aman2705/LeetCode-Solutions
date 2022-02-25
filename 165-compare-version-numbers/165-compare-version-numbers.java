class Solution {
    public int compareVersion(String version1, String version2) {
       
        String name[]=version1.split("\\.");
        String name1[]=version2.split("\\.");
        
        int n=0;
        if(name.length>name1.length)
        {
            n=name.length;
        }
        else
        {
            n=name1.length;
        }
        for(int i=0;i<n;i++)
        {
            int temp=0;
            int temp1=0;
            if(i<name.length)
                 temp=Integer.parseInt(name[i]);
            
            if(i<name1.length)
                  temp1=Integer.parseInt(name1[i]);
            
            if(temp>temp1)
                return 1;
            else if(temp<temp1)
                return -1;
        }
        return 0;
    }
}