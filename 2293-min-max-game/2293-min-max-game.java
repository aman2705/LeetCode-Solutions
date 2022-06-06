class Solution {
    public int minMaxGame(int[] nums) {
        int res=0;
        while(true){
            
            ArrayList<Integer> al=new ArrayList<>();
            boolean b=true;
            for(int i=0;i<nums.length;i=i+2){
                
                if(b==true)
                {
                    if(i+1<nums.length)
                        al.add(Math.min(nums[i],nums[i+1]));
                    else
                        al.add(nums[i]);
                }
                    
                else
                {
                    if(i+1<nums.length)
                        al.add(Math.max(nums[i],nums[i+1]));
                    else
                        al.add(nums[i]);
                }
                b=!b;
            }
            
            nums=new int[al.size()];
            for(int i=0;i<al.size();i++){
                nums[i]=al.get(i);
            }
            
            if(al.size()==1){
                res=al.get(0) ;
                break;
            }
               
        }
        return res;
       
    }
}