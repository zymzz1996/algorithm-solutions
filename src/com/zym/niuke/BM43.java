package com.zym.niuke;

import java.util.Stack;

public class BM43 {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void push(int node) {
        s1.push(node);
        if (s2.isEmpty() || s2.peek() > node) {
            s2.push(node);
        } else {
            s2.push(s2.peek());
        }
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }

}
