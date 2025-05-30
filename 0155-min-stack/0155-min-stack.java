class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;
    public MinStack() {
        st = new Stack<Integer>();
        min =new Stack<Integer>();
    }
    
    public void push(int val) {
        if (st.isEmpty()){
            st.push(val);
            min.push(val);
        } else{
            st.push(val);
            if (val<min.peek()){
                min.push(val);
            } else{
                min.push(min.peek());
            }
        }
    }
    
    public void pop() {
        min.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
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