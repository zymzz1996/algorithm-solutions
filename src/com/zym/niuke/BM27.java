package com.zym.niuke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BM27 {

    static void main() {
//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//        n1.left = n2;
//        n1.right = n3;
//        TreeNode n4 = new TreeNode(4);
//        TreeNode n5 = new TreeNode(5);
//        n3.left = n4;
//        n3.right = n5;
//        ArrayList<ArrayList<Integer>> res = new BM27().Print(n1);
//        System.out.println(res);

//        int[] array = {1,2,3,#,#,4,5};
        int[] array = {8,6,10,5,7,9,11};
        TreeNode treeNode = new TreeNode().createTree(array);
        ArrayList<ArrayList<Integer>> res = new BM27().Print(treeNode);
        System.out.println(res);
    }

    public ArrayList<ArrayList<Integer>> Print (TreeNode pRoot) {
        //层序遍历的基础上，将每一层的节点放在一个数组里
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Queue<ArrayList<TreeNode>> queue = new LinkedList<>();
        ArrayList<TreeNode> treeNodeList = new ArrayList<>();
        treeNodeList.add(pRoot);
        queue.offer(treeNodeList);
        //反转标志，用于控制当前层从左向右true，还是从右向左false
        boolean reverse = true;

        while (!queue.isEmpty()) {
            ArrayList<TreeNode> cur = queue.poll();
            ArrayList<Integer> floor =  new ArrayList<>();

            ArrayList<TreeNode> next = new ArrayList<>();

            for (TreeNode node : cur) {
                if (node.left != null) {
                    next.add(node.left);
                }

                if (node.right != null) {
                    next.add(node.right);
                }
            }

            if (reverse) {
                for (int i = 0; i < cur.size(); i++) {
                    TreeNode node = cur.get(i);
                    floor.add(node.val);
                }
            } else {
                for (int i = cur.size() - 1; i >= 0; i--) {
                    TreeNode node = cur.get(i);
                    floor.add(node.val);
                }
            }

            reverse = !reverse;
            if (!next.isEmpty()) {
                queue.offer(next);
            }
            res.add(floor);
        }

        return res;
    }

}
