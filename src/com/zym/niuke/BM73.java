package com.zym.niuke;

public class BM73 {

    public int getLongestPalindrome (String A) {
        //对于一个字符串，去除头尾后，如果是回文串，那么头尾相等就是回文串，头尾不相等就不是
        //特别的，对于一个字符，一定是回文串，对于两个字符，如果两个字符相同，一定是回文串
        //dp[i][j]代表长度i到j的字符串是不是回文串
        boolean[][] dp = new boolean[A.length()][A.length()];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
        }

        //从字串长度开始遍历
        for (int l = 2; l <= A.length(); l++) {
            //子串左界 i
            for (int i = 0; i < A.length(); i++) {
                //子串右界 j - i + 1 = l
                int j = l + i - 1;
                if (j >= A.length()) {
                    break;
                }

                if (A.charAt(i) != A.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

            }

        }

        int maxLength = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < A.length(); j++)  {
                if (dp[i][j] && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                }
            }
        }
        return maxLength;
    }

    // abbbba 中心扩散法
//    int maxLength = 0;
//        for (int i = 0; i < A.length(); i++) {
//        int length = 1;
//        int l = i - 1;
//        int r = i + 1;
//        while (l >= 0 && r < A.length()) {
//            if (A.charAt(l) == A.charAt(i)) {
//                l--;
//                length++;
//            }
//            if (A.charAt(r) == A.charAt(i)) {
//                r++;
//                length++;
//            }
//            if (A.charAt(l) == A.charAt(r)){
//                length += 2;
//            }
//            l--;
//            r++;
//        }
//
//        if (length > maxLength) {
//            maxLength = length;
//        }
//    }
//
//        return maxLength;

}
