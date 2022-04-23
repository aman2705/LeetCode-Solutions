class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<Integer> arr[]=new ArrayList[n+1];
        for(int i=0;i<n+1;i++)
        {
            arr[i]=new ArrayList<>();
        }
        for(int tru[]:trust)
        {
            arr[tru[0]].add(tru[1]);
        }
        int judge=-1;
        for(int i=1;i<n+1;i++)
        {
            if(arr[i].size()==0)
            {
                judge=i;
                break;
            }
        }
        for(int i=1;i<n+1;i++)
        {
            if(i==judge)
                continue;
            
            if(!arr[i].contains(judge))
            {
                judge=-1;
                break;
            }
        }
        return judge;
    }
}