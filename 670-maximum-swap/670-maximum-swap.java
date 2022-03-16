class Solution {
    public int maximumSwap(int n) {
       ArrayList<Integer> al=new ArrayList<>();
		 while(n!=0)
		 {
			 int r=n%10;
			 al.add(r);
			 n=n/10;
		 }
		 //System.out.println(al);
		 int a[]=new int[al.size()];
		 int start=0;
		 for(int i=al.size()-1;i>=0;i--)
		 {
			 a[start]=al.get(i);
			 start++;
		 }
		 int ans[]=new int[a.length];
		 ans[a.length-1]=a.length-1;
		int max=a.length-1;
		 for(int i=ans.length-2;i>=0;i--)
		 {
			if(a[i]>a[max])
			{
				ans[i]=i;
				max=i;
			}
			else
			{
				ans[i]=max;
			}
		 }
		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(ans));
		 
		 boolean flag=false;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[ans[i]]!=a[i])
			 {
				 flag=true;
				 for(int j=i+1;j<a.length;j++)
				 {
					 if(ans[i]==j)
					 {
						 swap(i,j,a);
						 break;
					 }
				 }
			 }
			 if(flag==true)
				 break;
			 
		 }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            sb.append(a[i]);
        }
        return Integer.parseInt(sb.toString());
    }
    private static void swap(int i, int j,int a[]) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return;
		
	}
}