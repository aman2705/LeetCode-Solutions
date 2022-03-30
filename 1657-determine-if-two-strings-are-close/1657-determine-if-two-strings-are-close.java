class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()>word2.length() || word2.length()>word1.length())
            return false;
        // arrays is used for checking the frequency
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        // hashset is used for checking the characters
        HashSet<Character> hm=new HashSet<>();
        HashSet<Character> hm1=new HashSet<>();
        // we need to check if same set of chars and freq is there
        
        for(int i=0;i<word1.length();i++)
        {
            char ch=word1.charAt(i);
            char ch2=word2.charAt(i);
            int index=ch-97;
            int index2=ch2-97;
            freq1[index]++;
            freq2[index2]++;
            hm.add(ch);
            hm1.add(ch2);
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        boolean a=true;
        boolean b=true;
        boolean c=true;
       
        for(Character ch:hm)
        {
            if(!hm1.contains(ch))
            {
                a=false;
                break;
            }
        }
        for(Character ch:hm1)
        {
            if(!hm.contains(ch))
            {
              b=false;
                break;
            }
            
        }
        for(int i=0;i<freq1.length;i++)
        {
            if(freq1[i]!=freq2[i])
            {
                c=false;
                break;
            }
        }
        return a&& b&& c;
        
    }
}