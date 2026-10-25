package com.zym.niuke;

import java.util.HashMap;
import java.util.Map;

public class BM50 {

    public int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(numbers[0], 1);
        for (int i = 1; i < numbers.length; i++) {
            int cur = numbers[i];
            if (map.containsKey(target - cur)) {
                return new int[]{map.get(target - cur), i + 1};
            }
            map.put(cur, i + 1);
        }
        return null;
    }

}
