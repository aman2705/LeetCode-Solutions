class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                 
                if(board[i][j]=='.')
                    continue;
                
                String row=i+"row"+board[i][j];
                String col=j+"col"+board[i][j];
                String sqr=i/3+"sqr"+j/3+"sqr"+board[i][j];
                
                hm.put(row,hm.getOrDefault(row,0)+1);
                hm.put(col,hm.getOrDefault(col,0)+1);
                hm.put(sqr,hm.getOrDefault(sqr,0)+1);
                
                if(hm.get(row)>1|| hm.get(col)>1 || hm.get(sqr)>1)
                    return false;
            }
        }
        return true;
    }
}