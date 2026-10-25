package com.zym.niuke;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class BM92 {

    public static void main(String[] args) {
        int[] arr = {2,2,4,3,3};
        int res = new BM92().maxLength(arr);
        System.out.println(res);
    }

    public int maxLength (int[] arr) {
        if (arr.length == 1) {
            return 1;
        }
        //[2,2,3,4,3]
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(arr[0], 0);
        int left = 0;
        int right = 0;
        int max = 0;
        while (right <= arr.length - 1) {
            if (map.containsKey(arr[right]) && left != right) {
                max = Math.max(max, right - left);
                //删除left到重复的元素
                Integer i = map.get(arr[right]);
                Iterator<Integer> iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    if (map.get(iterator.next()) <= i) {
                        iterator.remove();
                        left++;
                    }
                }
                map.put(arr[left], left);
            } else if (left == right) {
                map.put(arr[right], right);
                right++;
            } else {
                map.put(arr[right], right);
                right++;
            }
        }
        max = Math.max(max, right - left);
        return max;
    }

}
