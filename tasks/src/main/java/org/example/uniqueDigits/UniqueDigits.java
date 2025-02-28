package org.example.uniqueDigits;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/single-number-iii/description/

class UniqueDigits {
    int[] singleNumberIII(int[] nums) {
        final Map<Integer, Integer> mapArrToKeys = new HashMap<>();
        if (nums.length <= 2) {
            return nums;
        }

        for (Integer num : nums) {
            if (mapArrToKeys.containsKey(num)) {
                mapArrToKeys.put(num, -1);
            } else {
                mapArrToKeys.put(num, 1);
            }
        }

        return mapArrToKeys.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(1))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
