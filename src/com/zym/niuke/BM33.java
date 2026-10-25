package com.zym.niuke;

public class BM33 {

    public TreeNode Mirror (TreeNode pRoot) {
        if (null == pRoot) {
            return null;
        }

        TreeNode left = pRoot.left;
        TreeNode right = pRoot.right;
        TreeNode node = new TreeNode(pRoot.val);
        node.left = Mirror(right);
        node.right = Mirror(left);
        return node;
    }

}
