class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        boolean vis[]=new boolean[arr.length];
        vis[start]=true;
        while(!q.isEmpty())
        {
            int curr=q.poll();
            if(arr[curr]==0)
                return true;
                
            for(int  j:new int[]{curr-arr[curr],curr+arr[curr]})
            {
                if(j<0 || j>=arr.length || vis[j])
                    continue;
                vis[j]=true;
                q.add(j);
            }
        }
        return false;
    }
}