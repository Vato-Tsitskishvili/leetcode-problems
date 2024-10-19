package com.examle.leetcodeproblems.problems;

import com.examle.leetcodeproblems.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Number: 94
Difficulty: Easy
*/

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;
    }
}
