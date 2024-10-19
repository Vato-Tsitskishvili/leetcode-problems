package com.examle.leetcodeproblems.problems;

/*
Number: 35
Difficulty: Easy
*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int median = left + (right - left) / 2;

            if (nums[median] == target)
                return median;

            if (nums[median] < target)
                left = median + 1;

            if (nums[median] > target)
                right = median;
        }

        return left;
    }
}
