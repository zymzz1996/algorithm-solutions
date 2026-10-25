package com.zym.niuke;

public class BM86 {

    public static void main(String[] args) {
        String s = "114514";
        String t = "";
        String solve = new BM86().solve(s, t);
        System.out.println(solve);
    }

    public String solve (String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int tmp = carry;
            if (i >= 0) {
                tmp = tmp + s.charAt(i) - '0';
            }
            if (j >= 0) {
                tmp = tmp + t.charAt(j) - '0';
            }
            res.insert(0, tmp % 10);
            carry = tmp / 10;
            i--;
            j--;
        }
        if (carry > 0) {
            res.insert(0, carry);
        }
        return res.toString();
    }

}
