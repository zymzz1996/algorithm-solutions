package com.zym.niuke;

public class TreeNode {

    int val;         // 节点值
    TreeNode left;   // 左子节点引用
    TreeNode right;  // 右子节点引用
    TreeNode(int x) { val = x; }

    public TreeNode() {
    }

    public TreeNode createTree(int[] array) {
        if (array.length == 0) return null;
        TreeNode[] nodes = new TreeNode[array.length];
        for (int i = 0; i < array.length; i++) {
            nodes[i] = new TreeNode(array[i]);
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (2 * i + 1 < array.length) {
                nodes[i].left = nodes[2 * i + 1];
            }
            if (2 * i + 2 < array.length) {
                nodes[i].right = nodes[2 * i + 2];
            }
        }
        return nodes[0];
    }

}
