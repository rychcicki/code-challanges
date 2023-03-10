package org.example.aSpyDetected1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/1512/A
 */
public class ASpyDetected1 {
    FastReader sc = new FastReader();
    int numberOfTests = sc.nextInt();

    void loop() {
        for (int i = 1; i <= numberOfTests; i++) {
            aSpyDetected1(sc);
        }
    }

    int aSpyDetected1(FastReader sc) {
        int unique = 0;

        int lengthOfArray = sc.nextInt();
        int[] arr = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            int numbersInArray = sc.nextInt();
            arr[i] = numbersInArray;
        }

        int key = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(count -> count.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == key) {
                unique = j + 1;
            }
        }
        return unique;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
