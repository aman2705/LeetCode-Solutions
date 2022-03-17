class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            countsort(mat,i,0);
        }
        for(int j=1;j<m;j++)
        {
            countsort(mat,0,j);
        }
        return mat;
    }
    private static void countsort(int mat[][],int i,int j)
    {
        int n=mat.length;
        int m=mat[0].length;
        int r=i;
        int c=j;
        int freq[]=new int[101];
        while(i<n && j<m)
        {
            freq[mat[i][j]]++;
            i++;
            j++;
        }
        i=r;
        j=c;
        for(int index=0;index<101;index++)
        {
            while(freq[index]>0)
            {
                mat[i][j]=index;
                freq[index]--;
                i++;
                j++;
            }
        }
    }
}