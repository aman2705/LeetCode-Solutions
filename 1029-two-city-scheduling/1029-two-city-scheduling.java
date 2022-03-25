class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->
                   Integer.compare(a[0]-a[1],b[0]-b[1]));
        int sum=0;
        int len=costs.length/2;
        for(int i=0;i<costs.length;i++)
        {
            if(len>i)
                sum=sum+costs[i][0];
            else
                sum=sum+costs[i][1];
        }
        return sum;
    }
}