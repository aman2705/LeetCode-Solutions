class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        ArrayList<Integer> adjList[]=new ArrayList[n+1];
        for(int i=0;i<adjList.length;i++)
        {
            adjList[i]=new ArrayList<>();
        }
        int colors[]=new int[n+1];
        for(int i=0;i<colors.length;i++)
        {
            colors[i]=-1;
        }
        for(int i=0;i<dislikes.length;i++)
        {
            adjList[dislikes[i][0]].add(dislikes[i][1]);
            adjList[dislikes[i][1]].add(dislikes[i][0]);
        }
        for(int i=1;i<adjList.length;i++)
		{
			if(colors[i]==-1)
			{
                int node=i;
				colors[node]=1;
		        Queue<Integer> q=new LinkedList<>();
		        q.add(node);
		        while(!q.isEmpty())
		        {
			        Integer j=q.poll();
			        for(int k=0;k<adjList[j].size();k++)
			        {
				            int it=adjList[j].get(k);
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
		    }
		}
        return true;
		}
    }
  