class Solution {
    public int[][] largestLocal(int[][] arr) {
        
        int len=arr.length-2;
        int len1=arr[0].length-2;
        
           
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len1;j++) {
				int max=findmax(i,j,arr);
				al.add(max);
				
			}
		}
// 	// System.out.println(al);
	
	int localmatrix[][]=new int[len][len1];
	int start=0;
	for(int i=0;i<localmatrix.length;i++) {
		for(int j=0;j<localmatrix[0].length;j++) {
			localmatrix[i][j]=al.get(start);
			start++;
		}
	}
        return localmatrix;
        
    }
   private static int findmax(int i, int j, int[][] arr) {
		// TODO to find the max
		
		int max=Integer.MIN_VALUE;
		for(int start=i;start<i+3;start++) {
			for(int end=j;end<j+3;end++) {
				max=Math.max(max,arr[start][end]);
			}
		}
		
		
		return max;
	}
}