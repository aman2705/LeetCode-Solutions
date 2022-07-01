class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      
        Arrays.sort(boxTypes,new Comparator<int []>() {
			public int compare(int []a,int []b) {
				if(a[1]<b[1])
					return 1;
				else if(a[1]>b[1] ){
					return -1;
				}
				return 0;
			}
		});
        
        int res=0;
        for(int a[]:boxTypes){
            
            if(truckSize>=a[0]){
                truckSize=truckSize-a[0];
                res=res+(a[1]*a[0]);
            }
            else{
                
                res=res+(truckSize*a[1]);
                break;
            }
        }
        return res;
    }
}