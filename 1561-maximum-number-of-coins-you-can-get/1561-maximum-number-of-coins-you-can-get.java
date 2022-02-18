class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
		int n=piles.length/3;
		
		int count=0;
		int sum=0;
//	
		int end=piles.length-1;
		int start=0;
		while(count<n)
		{
			end--;
			sum=sum+piles[end--];
			start++;
			count++;
		}
        return sum;
    }
}