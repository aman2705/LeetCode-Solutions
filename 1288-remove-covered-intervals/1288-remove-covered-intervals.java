class Solution {
    public int removeCoveredIntervals(int[][] mat) {
    
        Arrays.sort(mat, (a, b) ->
        {
	   		if (a[0] == b[0])
	   			return b[1] - a[1];
	   		else
	   			return a[0] - b[0];
	   	});
        int count=0;
        int last=-1;
        
        for(int []a:mat)
        {
            if(last>=a[1])
            {
                count++;
            }
            else
            {
               last=a[1];
            }
        }
        return mat.length-count;
    }

   
   
}