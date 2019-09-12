import java.util.Stack;

class MyQueue {
    Stack<Integer> a;
    Stack<Integer> b;
    /** Initialize your data structure here. */
    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        a.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (b.isEmpty()){
            b.push(a.pop());
        }
        return b.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
    return b.isEmpty();
    }
}
