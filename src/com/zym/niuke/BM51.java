package com.zym.niuke;

import java.util.HashMap;
import java.util.Map;

public class BM51 {

    public int MoreThanHalfNum_Solution (int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        int half = numbers.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            if (map.containsKey(number)) {
                int count = map.get(number) + 1;
                if (count > half) {
                    return number;
                }
                map.put(number, count);
            } else {
                map.put(number, 1);
            }
        }

        return -1;
    }

}
