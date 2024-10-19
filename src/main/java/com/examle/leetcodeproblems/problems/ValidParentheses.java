package com.examle.leetcodeproblems.problems;

import java.util.Stack;

/*
Number: 20
Difficulty: Easy
*/

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;

        return stack.empty();
    }
}
