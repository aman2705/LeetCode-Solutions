class Solution {
    public String arrangeWords(String s) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			 public int compare(int[] w2, int[] w1) {
				 if(w1[0] > w2[0]) {
	                    return -1;
	                }
				 else if(w1[0] < w2[0]) {
	                    return 1;
	                }
				 else
					{
					 if(w1[1]>w2[1]) {
	                        return -1;
	                    }
						
	                    else {
	                        return 1;
	                    }
					}
			 }
		});
		//String s="To be or not to be";
		String arr[]=s.split(" ");
//		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			pq.add(new int[] {arr[i].length(),i});
		}
		String ans[]=new String[pq.size()];
		for(int i=0;i<ans.length;i++)
			ans[i]=arr[pq.poll()[1]];
		for(int i=0;i<ans.length;i++)
		{
			if(i==0)
			{
				 String firstLetStr =ans[i].substring(0, 1);
			     String remLetStr = ans[i].substring(1);
			     firstLetStr = firstLetStr.toUpperCase();
			     ans[i]= firstLetStr + remLetStr;
			}
			else
			{
				 String firstLetStr =ans[i].substring(0, 1);
			     String remLetStr = ans[i].substring(1);
			     firstLetStr = firstLetStr.toLowerCase();
			     ans[i]= firstLetStr + remLetStr;
			}
			
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ans.length-1;i++)
		{
			sb.append(ans[i]+" ");
		}
        sb.append(ans[ans.length-1]);
		return sb.toString();
		
	
    }
}