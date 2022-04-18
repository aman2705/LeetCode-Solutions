class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int passengers[]=new int[1001];
        for(int a[]:trips)
        {
            passengers[a[1]]=passengers[a[1]]+a[0];
            passengers[a[2]]= passengers[a[2]]-a[0];
        }
        int load=0;
        for(int i=0;i<passengers.length;i++)
        {
            load=load+passengers[i];
            if(load>capacity)
                return false;
        }
        return true;
    }
}