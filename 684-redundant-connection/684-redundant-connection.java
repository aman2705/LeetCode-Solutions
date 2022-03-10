class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        List<List<Integer>> al=new ArrayList<>(1001);
        for(int i=0;i<1001;i++)
        {
            ArrayList<Integer> al1=new ArrayList<>();
            al.add(al1);
        }
            
        
        int ans[]=null;
        for(int edge[]:edges)
        {
            
            int u=edge[0];
            int v=edge[1];
            if(dfs(u,v,0,al)==true)
            {
                 ans=edge;
                 break;
            }
               
            else
            {
                al.get(u).add(v);
                al.get(v).add(u);
            }
        }
        return ans;
        
    }
    private static boolean dfs(int u,int v,int pre,List<List<Integer>> al)
    {
        if(u==v)
            return true;
        
        for(int w:al.get(u))
        {
            if(w==pre)
                continue;
            
            boolean ret=dfs(w,v,u,al);
            if(ret==true)
                return true;
        }
        return false;
    }
}