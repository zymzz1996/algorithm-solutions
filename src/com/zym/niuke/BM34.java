package com.zym.niuke;

public class BM34 {

    static void main() {
        //{10,6,14,4,8,12,16,1,7}
        TreeNode tree = new TreeNode().createTree(new int[]{10, 6, 14, 4, 12});
        boolean serachTreeBST = isSearchTreeBST(tree, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(serachTreeBST);
    }

    public boolean isValidBST (TreeNode root) {
        return isValidBST1(root);

    }

    public boolean isValidBST1(TreeNode root) {
        //二叉搜索树：左子树的节点均小于根节点，右子树的节点均大于根节点，同时左右子树均为二叉搜索树
        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.val > root.val) {
            return false;
        }
        if (root.right != null && root.right.val < root.val) {
            return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }

    public boolean isValidBST2(TreeNode root, int rootVal) {
        //左子树的所有节点均小于根节点
        if (root == null) {
            return true;
        }
//        if (root.val) {
//
//        }
        return false;
    }


        //判断搜索树
    public static boolean isSearchTreeBST(TreeNode root, long left, long right){
        if(root == null)return true;

        if(root.val <= left || root.val >= right)return false;

        //对于左节点，最大值不能大于right（也就是当前节点的值），最小值不小于left
        return isSearchTreeBST(root.left, left, root.val) && isSearchTreeBST(root.right, root.val, right);
    }

}
