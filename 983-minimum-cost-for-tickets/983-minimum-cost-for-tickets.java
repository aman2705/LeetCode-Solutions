class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        int sindex=0;
        int dp[]=new int[days.length];
        Arrays.fill(dp,-1);
        
        return solve(sindex,days,costs,dp);
        
    }
    private static int solve(int index,int days[],int costs[],int dp[]){
        if(index>=days.length)
            return 0;
        
        if(dp[index]!=-1)
            return dp[index];
        
        int costforday1=costs[0]+solve(index+1,days,costs,dp);
        int i=index;
        
        for(i=index;i<days.length && days[i]<days[index]+7;i++);
        int costforday7=costs[1]+solve(i,days,costs,dp);
        
        for(i=index;i<days.length && days[i]<days[index]+30;i++);
        int costforday30=costs[2]+solve(i,days,costs,dp);
        
        // System.out.println(Math.min(costforday1,Math.min(costforday7,costforday30)));
        return dp[index]=Math.min(costforday1,Math.min(costforday7,costforday30));
    }
}