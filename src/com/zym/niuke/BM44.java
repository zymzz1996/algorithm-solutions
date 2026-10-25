package com.zym.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BM44 {

    static void main() {
        String s = "[]";
        new BM44().isValid(s);
    }

    public boolean isValid (String s) {
        //注意边界条件
        if (null == s) {
            return true;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (!stack.pop().equals(map.get(c))) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
