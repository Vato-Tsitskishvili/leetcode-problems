package com.examle.leetcodeproblems.problems;

import com.examle.leetcodeproblems.utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Number: 95
Difficulty: Medium
*/

public class UniqueBinarySearchTrees2 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return Collections.emptyList();

        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int min, int max) {
        if (min > max)
            return Collections.singletonList(null);

        List<TreeNode> result = new ArrayList<>();

        for (int i = min; i <= max; i++)
            for (TreeNode left : generateTrees(min, i - 1))
                for (TreeNode right : generateTrees(i + 1, max)) {
                    result.add(new TreeNode(i));
                    result.get(result.size() - 1).left = left;
                    result.get(result.size() - 1).right = right;
                }

        return result;
    }
}
