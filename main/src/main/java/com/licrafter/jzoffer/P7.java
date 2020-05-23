package com.licrafter.jzoffer;

import com.licrafter.TreeNode;

/**
 * Created by shell on 2020/5/23.
 * <p>
 * Gmail: shellljx@gmail.com
 */
public class P7 {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstruct(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode reConstruct(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preStart]);

        for (int index = inStart; index <= inEnd; index++) {
            if (in[index] == root.val) {
                root.left = reConstruct(pre, preStart + 1, preStart + index - inStart, in, inStart, index - 1);
                root.right = reConstruct(pre, preStart + index - inStart + 1, preEnd, in, index + 1, inEnd);
                break;
            }
        }
        return root;
    }
}
