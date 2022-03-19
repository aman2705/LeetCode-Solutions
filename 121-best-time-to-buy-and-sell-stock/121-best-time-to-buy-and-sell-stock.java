class Solution {
    public int maxProfit(int[] price) {
        
        int min=price[0];
        int cost=0;
        for(int i=1;i<price.length;i++)
        {
            int price1=price[i]-min;
            cost=Math.max(cost,price1);
            
            min=Math.min(min,price[i]);
        }
        return cost;
    }
}