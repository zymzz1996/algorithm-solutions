package com.zym.niuke;

import java.util.Arrays;

public class BM85 {

    public static void main(String[] args) {

        String s = "1:2:";
        String[] split = s.split(":", -1);
        System.out.println(Arrays.toString(split));

    }

    public String solve(String IP) {
        if (isIPv4(IP)) {
            return "IPv4";
        } else if (isIPv6(IP)) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }

    private boolean isIPv4(String IP) {
        String[] split = IP.split("\\.");
        if (split.length != 4) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() == 0) {
                return false;
            }
            if (split[i].length() != 1 && split[i].charAt(0) == '0') {
                return false;
            }
            int num = 0;
            for (int j = 0; j < split[i].length(); j++) {
                if (split[i].charAt(j) < '0' || split[i].charAt(j) > '9') {
                    return false;
                }
                num = num * 10 + split[j].charAt(j) - '0';
            }
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }

    private boolean isIPv6(String IP) {
        String[] split = IP.split(":");
        if (split.length != 8) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() == 0 || split[i].length() > 4) {
                return false;
            }
            for (int j = 0; j < split[i].length(); j++) {
                char c = split[i].charAt(j);
                if (!((c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f') || (c >= '0' &&
                        c <= '9'))) {
                    return false;
                }
            }
        }
        return true;
    }

}
