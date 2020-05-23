package com.licrafter.jzoffer;

import java.util.Stack;

/**
 * Created by shell on 2020/5/23.
 * <p>
 * Gmail: shellljx@gmail.com
 */
public class P9 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
