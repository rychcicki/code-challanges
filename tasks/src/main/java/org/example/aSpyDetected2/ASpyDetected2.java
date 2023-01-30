package org.example.aSpyDetected2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/problemset/problem/1512/A
 */
public class ASpyDetected2 {
    FastReader sc = new FastReader();
    int numberOfTests = sc.nextInt();

    void loop() {
        while (numberOfTests-- > 0) {
            aSpyDetected2(sc);
        }
    }

    public int aSpyDetected2(FastReader sc) {
        int lengthOfArray = sc.nextInt();
        int[] arr = new int[lengthOfArray];
        int unique = 0;
        int key;

        for (int i = 0; i < lengthOfArray; i++) {
            int numbersInArray = sc.nextInt();
            arr[i] = numbersInArray;
        }

        List<Integer> listOfNumbers = Arrays.stream(arr)
                .boxed()
                .sorted()
                .toList();
        int firstNumberOfListOfNumbers = listOfNumbers.get(0);

        if (firstNumberOfListOfNumbers == listOfNumbers.get(1)) {
            key = listOfNumbers.get(arr.length - 1);
        } else {
            key = firstNumberOfListOfNumbers;
        }

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
