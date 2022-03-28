class Solution {
    public int minDeletions(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=ch-97;
            freq[ascii]++;
        }
        HashSet<Integer> hm=new HashSet<>();
        int delete=0;
        for(int i=0;i<freq.length;i++)
        {
            while(freq[i]!=0 && hm.contains(freq[i]))
            {
                freq[i]--;
                delete++;
            }
            hm.add(freq[i]);
        }
        return delete;
    }
}