class Solution {
    public int totalFruit(int[] fruits) {
        int i=-1;
        int j=-1;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(true)
        {

            boolean a=false;
            boolean b=false;
            while(i<fruits.length-1)
            {
                a=true;
                i++;
                hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
                if(hm.size()<=2)
                {
                    int len=i-j;
                    if(ans<len)
                        ans=len;
                }
                else if(hm.size()>2)
                    break;
            }
            while(j<i)
            {
                b=true;
                j++;
                
                if(hm.get(fruits[j])==1)
                    hm.remove(fruits[j]);
                else
                    hm.put(fruits[j],hm.get(fruits[j])-1);
                
                if(hm.size()>2)
                    continue;
                
                else if(hm.size()<=2)
                {
                    int len=i-j;
                    if(ans<len)
                        ans=len;
                    break;
                }
            }
            if(a==false && b==false)
                break;
        }
        return ans;
    }
}