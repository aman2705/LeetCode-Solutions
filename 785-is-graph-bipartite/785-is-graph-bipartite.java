class Solution {
    public boolean isBipartite(int[][] graph) {
        
        ArrayList<Integer> adjList[]=new ArrayList[graph.length];
        for(int i=0;i<adjList.length;i++)
        {
            adjList[i]=new ArrayList<>();
        }
        int colors[]=new int[graph.length];
        for(int i=0;i<colors.length;i++)
        {
            colors[i]=-1;
        }
  
		for(int i=0;i<graph.length;i++)
		{
			for(int j=0;j<graph[i].length;j++)
			{
				adjList[i].add(graph[i][j]);
                adjList[graph[i][j]].add(i);
			}
		}
        
        
        for(int i=0;i<adjList.length;i++)
        {
            if(colors[i]==-1)
                if(!bfs(i,adjList,colors))
                    return false;
        }
        return true;
    }
     private static boolean bfs(int node,ArrayList<Integer>[] adjList,int []colors)
	{
		colors[node]=1;
		Queue<Integer> q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty())
		{
			Integer j=q.poll();
			for(int i=0;i<adjList[j].size();i++)
			{
				int it=adjList[j].get(i);
				if(colors[it]==-1)
				{
					q.add(it);
					colors[it]=1-colors[j];
				}
				else if(colors[it]==colors[j])
				{
					return false;
				}
			}
		}
		return true;
	}
}