package com.examle.leetcodeproblems.problems;

import com.examle.leetcodeproblems.utils.TreeNode;

/*
Number: 104
Difficulty: Easy
*/

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
