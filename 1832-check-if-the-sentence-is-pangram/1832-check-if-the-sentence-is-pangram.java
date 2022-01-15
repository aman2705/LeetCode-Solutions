class Solution {
    public boolean checkIfPangram(String sentence) {
        
        sentence=sentence.toLowerCase();
        boolean res[]=new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            int ascii=ch-97;
            res[ascii]=true;
        }
        for(int i=0;i<res.length;i++)
        {
            if(res[i]==false)
                return false;
        }
        return true;
    }
}