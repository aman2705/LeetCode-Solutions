class MinStack {

    Stack<Node> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
            st.push(new Node(val,val));
        else
            st.push(new Node(val,Math.min(st.peek().min,val)));
    }
    
    public void pop() {
        if(!st.isEmpty())
            st.pop();
    }
    
    public int top() {
       return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
    
}
 class Node
    {
        int val;
        int min;
         Node(int val,int min){
            this.val=val;
            this.min=min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */