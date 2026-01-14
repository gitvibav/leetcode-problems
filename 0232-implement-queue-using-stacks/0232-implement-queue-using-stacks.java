class MyQueue {
    Stack<Integer> st;

    public MyQueue() {
        st = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        if (st.isEmpty()) return -1;

        int top = st.pop();

        // If this was the last element, it's the front
        if (st.isEmpty()) {
            return top;
        }

        int front = pop();     // recursive call
        st.push(top);          // restore stack
        return front;
    }

    public int peek() {
        if (st.isEmpty()) return -1;

        int top = st.pop();

        if (st.isEmpty()) {
            st.push(top);
            return top;
        }

        int front = peek();
        st.push(top);
        return front;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}
