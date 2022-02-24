class Solution {
    public int[] avoidFlood(int[] rain) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        TreeSet<Integer> dryday=new TreeSet<>();
        int ans[]=new int[rain.length];
        int n=rain.length;
        int index=0;
        for(int i=0;i<rain.length;i++)
        {
            if(rain[i]==0)
            {
                ans[index++]=1;
                dryday.add(i);
            }
            else
            {
                if(hm.containsKey(rain[i]))
                {
                    Integer day=dryday.higher(hm.get(rain[i]));
                    if(day==null)
                    {
                        return new int[]{};
                    }
                    ans[day]=rain[i];
                    dryday.remove(day);
                    
                }
                ans[index++]=-1;
                hm.put(rain[i],i);
            }
        }
        return ans;
    }
}