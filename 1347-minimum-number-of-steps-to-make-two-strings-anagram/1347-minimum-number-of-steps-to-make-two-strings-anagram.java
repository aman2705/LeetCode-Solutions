class Solution {
    public int minSteps(String word1, String word2) {
        int freq[]=new int[26];
        for(int i=0;i<word1.length();i++)
        {
            char ch=word1.charAt(i);
            char ch2=word2.charAt(i);
            int index=ch-97;
            int index2=ch2-97;
            freq[index]++;
            freq[index2]--;
            
        }
        int count=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
                count=count+freq[i];
        }
        return count;
    }
}