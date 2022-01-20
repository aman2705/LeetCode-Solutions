class Solution {
    public int minMoves(int target, int maxdoubles) {
      int count=0;
	
		while(target>1)
		{
			if(target%2==1)
			{
				target=target-1;
			}
			else if(target%2==0 && maxdoubles>0)
			{
				target=target/2;
				maxdoubles--;
			}
			else if(maxdoubles==0)
			{
				count=count+(target-1);
				break;
			}
			count++;
		}
        return count;
    }
}