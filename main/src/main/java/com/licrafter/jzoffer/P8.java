package com.licrafter.jzoffer;

import com.licrafter.TreeLinkNode;

/**
 * Created by shell on 2020/5/23.
 * <p>
 * Gmail: shellljx@gmail.com
 */
public class P8 {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        if (pNode == null) {
            return null;
        }

        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {
            TreeLinkNode current = pNode;
            TreeLinkNode parent = pNode.next;
            while (parent != null) {
                if (current == parent.left) {
                    return parent;
                }
                current = parent;
                parent = parent.next;
            }
            return null;
        }
    }
}
