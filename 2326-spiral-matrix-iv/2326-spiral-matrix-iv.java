/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int matrix[][]=new int[m][n];
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        for (int[] row : matrix)
            Arrays.fill(row, -1);
        
        
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        int dir=0;
        int index=0;
        
        while(left<=right && top<=bottom && index<al.size())
        {
            if(dir==0 && index<al.size())
            {
                for(int i=left;i<=right;i++){
                     matrix[top][i]=al.get(index);
                     index++;
                    if(index==al.size())
                        break;
                }
                   
                top++;
               
              
            }
            else if(dir==1 && index<al.size())
            {
                for(int i=top;i<=bottom;i++){
                    matrix[i][right]=al.get(index);
                     index++;
                    if(index==al.size())
                        break;
                }
                right--;
                
            }
            else if(dir==2 && index<al.size())
            {
                for(int i=right;i>=left;i--){
                   matrix[bottom][i]=al.get(index);
                     index++;
                    if(index==al.size())
                        break;
                }
                bottom--;
                
            }
            else if(dir==3 && index<al.size())
            {
                for(int i=bottom;i>=top;i--){
                  matrix[i][left]=al.get(index);
                    index++;
                    if(index==al.size())
                        break;
                }
                left++;
                
            }
            dir=(dir+1)%4;
            if(index==al.size())
                break;
        }
        
        
        
        return matrix;
    }
}