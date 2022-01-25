class Solution {
    public void sortColors(int[] arr) {
        int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	int range = max - min + 1;
    int[] ans = new int[arr.length];
    
    int[] farr = new int[range];
    for (int i = 0 ; i < arr.length; i++) {
      farr[arr[i] - min]++;
    }
   
    for (int i = 1 ; i < farr.length; i++) {
      farr[i] += farr[i - 1];
    }
    
    for (int i = arr.length - 1; i >= 0; i--) {
      int pos = farr[arr[i] - min] - 1;
      ans[pos] = arr[i];
      farr[arr[i] - min]--;
    }
   
    for (int i = 0 ; i < arr.length; i++) {
      arr[i] = ans[i];
    }
    }
}