package com.licrafter.jzoffer;

import com.licrafter.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by shell on 2020/5/22.
 * <p>
 * Gmail: shellljx@gmail.com
 */
public class P6 {

    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //递归解法
        recursive(listNode);
        return list;
    }

    //递归解法
    public void recursive(ListNode root) {
        if (root == null) {
            return;
        }
        if (root.next != null) {
            recursive(root.next);
        }
        list.add(root.val);
    }

    //栈解法
    public void stack(ListNode root) {
        if (root == null) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while (root != null) {
            stack.push(root.val);
            root = root.next;
        }

        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
    }

}
