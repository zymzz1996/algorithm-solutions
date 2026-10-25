package com.zym.niuke;

public class BM36 {

    public boolean IsBalanced_Solution (TreeNode pRoot) {
        if (null == pRoot) {
            return true;
        }
        int leftHeight = calcHeight(pRoot.left);
        int rightHeight = calcHeight(pRoot.right);
        //左子树是平衡树且右子树是平衡树且左子树的高度和右子树的高度相差不超过1
        return IsBalanced_Solution(pRoot.left) && IsBalanced_Solution(pRoot.right) && Math.abs(leftHeight - rightHeight) <= 1;
    }

    private int calcHeight(TreeNode t) {
        if (null == t) {
            return 0;
        }
        return Math.max(calcHeight(t.left), calcHeight(t.right)) + 1;
    }

}
