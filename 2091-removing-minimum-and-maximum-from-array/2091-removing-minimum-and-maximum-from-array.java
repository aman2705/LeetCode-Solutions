class Solution {
    public int minimumDeletions(int[] a) {
        if(a.length==1 || a.length==2)
            return a.length;
        
        int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			max=Math.max(max, a[i]);
			min=Math.min(min, a[i]);
		}
		// System.out.println(min);
		// System.out.println(max);
		// three cases
		//left
		//left
		int lc=0;
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==max || a[i]==min)
			{
				lc=lc+(i-index)+1;
				index=i+1;
				
			}
		}
		// System.out.println(lc);
		int rc=0;
		index=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==min || a[i]==max)
			{
				rc=rc+(index-i)+1;
				index=i-1;
			}
		}
		// System.out.println(rc);
		
		// for both
		int bothl=0;
		int bothc=0;
		index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==min|| a[i]==max)
			{
				bothl=bothl+(i-index)+1;
				break;
			}
		}
		index=a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]==min|| a[i]==max)
			{
				bothc=bothc+(index-i)+1;
				break;
			}
		}
		int res=bothl+bothc;
		// System.out.println(res);
        return Math.min(lc,Math.min(rc,res));

    }
}