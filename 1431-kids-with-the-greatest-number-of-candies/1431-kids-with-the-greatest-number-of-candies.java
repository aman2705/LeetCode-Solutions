class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res=new ArrayList<Boolean>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            int it=candies[i]+extraCandies;
            if(it>=max)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
            
        }
        return res;
    }
}