class Solution {
    public int maxDistance(int[] a, int[] b) {
       
        int ans=0;
        int i=0;
        int j=0;
		while(i<a.length && j<b.length)
        {
            if(a[i]>b[j])
                i++;
            else
            {
                 ans=Math.max(ans,j-i);
                j++;
            }
               
        }
        return ans;
    }
}