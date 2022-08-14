
class Solution {
    public int reachableNodes(int n, int[][] edges, int[] arr) {
        
        ArrayList<ArrayList<Integer>> al=new ArrayList<>(edges.length+1);
        for(int i=0;i<=edges.length;i++){
            al.add(new ArrayList<Integer>());
        }
        for(int a[]:edges){
            al.get(a[0]).add(a[1]);
            al.get(a[1]).add(a[0]);
        }
        int vis[]=new int[edges.length+1];
        for(int i=0;i<arr.length;i++){
            vis[arr[i]]=1;
        }
        int count[]=new int[1];
        dfs(0,al,count,vis,arr);
        return count[0];
    }
    private static void dfs(int node,ArrayList<ArrayList<Integer>> adjList,int count[],int vis[],int arr[])
	{
        count[0]++;
		vis[node]=1;
		for(int i=0;i<adjList.get(node).size();i++)
		{
			if(vis[adjList.get(node).get(i)]==0)
				dfs(adjList.get(node).get(i),adjList,count,vis,arr);
		}
	}
}