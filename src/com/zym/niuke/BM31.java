package com.zym.niuke;

public class BM31 {

    public boolean isSymmetrical(TreeNode pRoot) {
        if (null == pRoot) {
            return true;
        }
        return isSame(pRoot.left, pRoot.right);
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if (left != null && right != null && left.val == right.val) {
            return isSame(left.left, right.right) && isSame(left.right, right.left);
        } else if (null == left && null == right) {
            return true;
        } else {
            return false;
        }
    }

}
