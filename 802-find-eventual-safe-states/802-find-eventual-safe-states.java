class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> adjList[]=new ArrayList[graph.length];
        for(int i=0;i<adjList.length;i++)
            adjList[i]=new ArrayList<>();
        
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                adjList[i].add(graph[i][j]);
            }
        }
        int vis[]=new int[graph.length];
        int dfsvis[]=new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(dfs(i,vis,dfsvis,adjList)==false)
                res.add(i);
        }
        return res;
    }
    private static boolean dfs(int node,int vis[],int dfsvis[],ArrayList<Integer> adjList[])
    {
        vis[node]=1;
        dfsvis[node]=1;
        for(int i=0;i<adjList[node].size();i++)
        {
            int it=adjList[node].get(i);
            if(vis[it]==0)
            {
                if(dfs(it,vis,dfsvis,adjList))
                    return true;
            }
            else if(dfsvis[it]==1)
            {
                return true;
            }
        }
        dfsvis[node]=0;
        return false;
    }
}