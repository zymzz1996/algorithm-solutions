package com.zym.niuke;

public class BM84 {

    public String longestCommonPrefix (String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String str : strs) {
            int i = 0;
            while (i < str.length() && i < prefix.length() && str.charAt(i) == prefix.charAt(i)) {
                i++;
            }
            prefix = prefix.length() < str.length() ? prefix.substring(0, i) : str.substring(0, i);
        }
        return prefix;
    }

}
