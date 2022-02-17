class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(Integer i:hm.keySet())
        {
            if(map.containsKey(hm.get(i)))
            {
                return false;
            }
            map.put(hm.get(i),true);
        }
        return true;
        
    }
}