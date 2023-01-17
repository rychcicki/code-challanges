package org.example.uniqueDigits;

import java.util.HashMap;
import java.util.Map;

/**
 * 260. Single Number III
 * https://leetcode.com/problems/single-number-iii/description/
 */
public class UniqueDigits {
    public int[] singleNumberIII(int[] nums) {
        Map<Integer, Integer> mapArrToKeys = new HashMap<>();
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

        int[] unique = mapArrToKeys.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(1))
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return unique;
    }
}
