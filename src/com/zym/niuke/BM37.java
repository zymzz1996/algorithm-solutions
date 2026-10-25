package com.zym.niuke;

public class BM37 {

    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        if (root.val <= p && root.val >= q) {
            return root.val;
        }
        if (root.val >= p && root.val <= q) {
            return root.val;
        }
        if (root.val <= p && root.val <= q) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return lowestCommonAncestor(root.left, p, q);
        }

    }



}
