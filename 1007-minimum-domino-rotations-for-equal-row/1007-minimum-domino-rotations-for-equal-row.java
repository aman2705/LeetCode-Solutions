class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        int countup[]=new int[7];
        int countdown[]=new int[7];
        int same[]=new int[7];
        
        for(int i=0;i<tops.length;i++)
        {
            countup[tops[i]]++;
            countdown[bottoms[i]]++;
            
            if(tops[i]==bottoms[i])
                same[tops[i]]++;
        }
       
        for(int i=1;i<7;i++)
        {
            if(countup[i]+countdown[i]-same[i]==tops.length)
            {
                // System.out.println(countup[i]);
                // System.out.println(countdown[i]);
                // System.out.println(same[i]);
                return Math.min(countup[i],countdown[i])-same[i];
            }
               
        }
        return -1;
    }
}