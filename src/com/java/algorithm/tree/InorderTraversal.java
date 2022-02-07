package com.java.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Trae.Liu
 * @create: 2022-02-07 16:52
 * @description: 二叉树中序遍历
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {
        if (root == null){
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.left, result);
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}