class Solution {
    public int candy(int[] ratings) {
        
        int leftright[]=new int[ratings.length];
        int rightleft[]=new int[ratings.length];
        Arrays.fill(leftright,1);
        Arrays.fill(rightleft,1);
        for(int i=1;i<leftright.length;i++){
            if(ratings[i]>ratings[i-1]){
                leftright[i]=leftright[i-1]+1;
            }
        }
        for(int i=rightleft.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                rightleft[i]=rightleft[i+1]+1;
            }
        }
        
        
        int sum=0;
        for(int i=0;i<ratings.length;i++){
            sum=sum+Math.max(rightleft[i],leftright[i]);
        }
        return sum;
        
    }
}