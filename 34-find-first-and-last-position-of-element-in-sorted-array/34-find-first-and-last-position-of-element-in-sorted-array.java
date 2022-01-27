class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res=firstposn(nums,target);
		int lres=lastposn(nums,target);
		int ans[]=new int[2];
        ans[0]=res;
        ans[1]=lres;
        return ans;
    }
    private static int firstposn(int[] a,int target) {
		// TODO Auto-generated method stub
		int low=0;
		int high=a.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==target)
			{
				ans=mid;
				high=mid-1;
			}
			else if(a[mid]<target)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return ans;
	}
    private static int lastposn(int[] a,int target) {
		// TODO Auto-generated method stub
		int low=0;
		int high=a.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==target)
			{
				ans=mid;
				low=mid+1;
			}
			else if(a[mid]<target)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return ans;
	}
}