class Solution {
    public int mostWordsFound(String[] sentences) {
        int length=0;
        for(int i=0;i<sentences.length;i++)
        {
            String arr[]=sentences[i].split(" ");
            length=Math.max(length,arr.length);
        }
            
        return length;
    }
}