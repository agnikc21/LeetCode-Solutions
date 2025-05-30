class MyQueue {
    private Stack<Integer> q1;
    private Stack<Integer> q2;
    public MyQueue() {
        q1= new Stack<>();
        q2 = new Stack<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while (!q1.isEmpty()){
            q2.add(q1.pop());
        }
        int x = q2.pop();
        while (!q2.isEmpty()){
            q1.add(q2.pop());
        }
        return x;
    }
    
    public int peek() {
        while (!q1.isEmpty()){
            q2.add(q1.pop());
        }
        int x = q2.peek();
        while (!q2.isEmpty()){
            q1.add(q2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */