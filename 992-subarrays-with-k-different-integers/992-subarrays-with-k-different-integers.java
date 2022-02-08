class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        if(k==1)
        {
            return removalfor1(nums);
        }
        int is=-1;
        int ib=-1;
        int j=-1;
        int count=0;
        HashMap<Integer,Integer> ibig=new HashMap<>();
        HashMap<Integer,Integer> ismall=new HashMap<>();
        
        while(true)
        {
            boolean a=false;
            boolean b=false;
            boolean c=false;
            
            while(ib<nums.length-1)
            {
                a=true;
                ib++;
                int num=nums[ib];
                ibig.put(num,ibig.getOrDefault(num,0)+1);
                if(ibig.size()==k+1)
                {
                    remove(num,ibig);
                    ib--;
                    break;
                }
                
            }
            while(is<ib)
            {
                b=true;
                is++;
                int num=nums[is];
                ismall.put(num,ismall.getOrDefault(num,0)+1);
                if(ismall.size()==k)
                {
                    remove(num,ismall);
                    is--;
                    break;
                }
            }
            while(j<is)
            {
                c=true;
                if(ismall.size()==k-1 && ibig.size()==k)
                {
                    count=count+ib-is;
                }
                j++;
                int num=nums[j];
                remove(num,ibig);
                remove(num,ismall);
                if(ismall.size()<k-1 || ibig.size()<k)
                {
                    break;
                }
            }
            if(b==false && a==false && c==false)
            {
                break;
            }
        }
        return count;
    }
    private static void remove(int num,HashMap<Integer,Integer> hm)
    {
        if(hm.get(num)==1)
            hm.remove(num);
        else
            hm.put(num,hm.getOrDefault(num,0)-1);
        
    }
    private static int removalfor1(int nums[])
    {
        HashMap<Integer,Integer> ad=new HashMap<>();
        int i=-1;
        int j=-1;
        int count=0;
        while(true)
        {
            boolean a=false;
            boolean b=false;
             while(i<nums.length-1)
            {
                a=true;
                i++;
                int num=nums[i];
                ad.put(num,ad.getOrDefault(num,0)+1);
                if(ad.size()==2)
                {
                    remove(num,ad);
                    i--;
                    break;
                }
            }
            while(j<i)
            {
                b=true;
                if(ad.size()==1)
                {
                    count=count+i-j;
                }
                j++;
                int num=nums[j];
                remove(num,ad);
                if(ad.size()<1)
                {
                    break;
                }
            }
            if(a==false && b==false)
            {
                break;
            }
        }
       return count;
    }
}