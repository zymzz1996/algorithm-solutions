package com.zym.niuke;

public class BM29 {

    static void main() {
        int[] array = {8,6,10,5,7,9,11};
        TreeNode treeNode = new TreeNode().createTree(array);
        int maxDepth = new BM28().maxDepth(treeNode);
        boolean b = new BM29().hasPathSum(treeNode, 20);
        System.out.println(b);
        // {5,4,8,1,11,#,9,#,#,2,7},22
    }

    public boolean hasPathSum (TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        //终止条件：左右子树不存在
        return hasPathSum(root, sum, 0);
    }

    public boolean hasPathSum (TreeNode node, int sum, int self) {
        //终止条件：左右子树不存在
        if (node.left == null && node.right == null) {
            return node.val + self == sum;
        }

        if (node.left != null) {
            boolean res = hasPathSum(node.left, sum, self + node.val);
            if (res) {
                return true;
            }
        }
        if (node.right != null) {
            boolean res = hasPathSum(node.right, sum, self + node.val);
            if (res) {
                return true;
            }
        }
        return false;
    }

}
