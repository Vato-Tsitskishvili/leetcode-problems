package com.examle.leetcodeproblems.problems;

/*
number: 9
difficulty: Easy
*/

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int sum = 0;
        int target = x;

        while (x > 0) {
            int temp = x % 10;
            x = x / 10;
            sum = sum * 10 + temp;
        }

        return sum == target;
    }
}
