class Solution {
    public int[] distributeCandies(int candies, int num_people) {
       
        int ans[]=new int[num_people];
        int candy=1;
        int i=0;
        while(candy<=candies)
        {
            if(i==ans.length)
                i=0;
            
            ans[i]=ans[i]+candy;
            candies=candies-candy;
            candy++;
            i++;
        }
        if(candies>0)
        {
            if(i==ans.length)
                i=0;
            
            ans[i]=ans[i]+candies;
            
        }
        return ans;
    }
}