package 剑指;

import java.util.Stack;

public class Solution {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stackmin = new Stack<>();
    public void push(int node) {
        stack1.push(node);
        if (stackmin.empty()){
            stackmin.push(node);
        }else {
            if (node<=stackmin.peek()){
                stackmin.push(node);
            }else {
                stackmin.push(stackmin.peek());
            }
        }
    }

    public void pop() {
        stack1.pop();
        stackmin.pop()
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stackmin.peek();
    }
}
