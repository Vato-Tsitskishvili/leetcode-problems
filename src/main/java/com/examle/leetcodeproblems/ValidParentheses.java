package com.examle.leetcodeproblems;

import java.util.Stack;

/*
number: 20
difficulty: Easy
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
