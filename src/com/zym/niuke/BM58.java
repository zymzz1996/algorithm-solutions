package com.zym.niuke;

import java.util.ArrayList;
import java.util.HashMap;

public class BM58 {

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = new BM58().Permutation(str);
        System.out.println(res);
    }

    public ArrayList<String> Permutation (String str) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean[] mark = new boolean[str.length()];
        HashMap<String, String> map = new HashMap<>();
        back(str.toCharArray(), sb, res, mark, map);

        return res;
    }

    public void back(char[] chars, StringBuilder sb, ArrayList<String> res, boolean[] mark, HashMap<String, String> map) {
        if (sb.length() == chars.length) {
            String s = sb.toString();
            if (!map.containsKey(s)) {
                res.add(s);
                map.put(s, s);
            }
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (mark[i]) {
                continue;
            }
            sb.append(chars[i]);
            mark[i] = true;
            back(chars, sb, res, mark, map);
            sb.deleteCharAt(sb.length() - 1);
            mark[i] = false;
        }
    }

}
