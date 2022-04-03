class Solution {
    public int convertTime(String current, String correct) {
        String []ac=current.split(":");
		String ec[]=correct.split(":");
		int curr=Integer.parseInt(ac[0])*60+Integer.parseInt(ac[1]);
		int endtime=Integer.parseInt(ec[0])*60+Integer.parseInt(ec[1]);
		int count=0;
		while(endtime>curr)
		{
			int res=endtime-curr;
			if(res>=60)
			{
				endtime=endtime-60;
				count++;
			}
			else if(res>=15)
			{
				endtime=endtime-15;
				count++;
			}
			else if(res>=5)
			{
				endtime=endtime-5;
				count++;
			}
			else {
				endtime=endtime-1;
				count++;
			}

		}
		return count;
    }
}