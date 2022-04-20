class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        int []dirx={2,2,-2,-2,-1,+1,-1,+1};
        int []diry={+1,-1,+1,-1,+2,+2,-2,-2};
        HashMap<String,Double> hm=new HashMap<>();
        return solve(row,column,k,hm,dirx,diry,n);
    }
    private static double solve(int r,int c,int k,HashMap<String,Double> hm,int[]dirx,int diry[],int n)
    {
        if(validate(r,c,n)==false)
            return 0;
        
        if(k==0)
            return 1;
        
        String key=r+"aman"+c+"samal"+k;
        
        if(hm.containsKey(key))
            return hm.get(key);
        
        double probability=0;
        for(int i=0;i<dirx.length;i++)
        {
            probability=probability+solve(r+dirx[i],c+diry[i],k-1,hm,dirx,diry,n)/8.0;
        }
        hm.put(key,probability);
        return probability;
    }
    private static boolean validate(int r,int c,int n)
    {
        if(r<0 || c<0 || r>=n || c>=n)
            return false;
        return true;
    }
}