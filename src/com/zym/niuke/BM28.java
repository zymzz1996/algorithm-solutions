package com.zym.niuke;

public class BM28 {

    static void main() {
        int[] array = {8,6,10,5,7,9,11};
        TreeNode treeNode = new TreeNode().createTree(array);
        int maxDepth = new BM28().maxDepth(treeNode);
        System.out.println(maxDepth);
    }

    public int maxDepth (TreeNode root) {
        if (null == root) {
            return 0;
        }

//        int i1 = 1;
//        if (root.left != null) {
//            i1 = maxDepth(root.left) + i1;
//        }
//
//        int i2 = 1;
//        if (root.right != null) {
//            i2 = maxDepth(root.right) + i2;
//        }

        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);

    }

}
