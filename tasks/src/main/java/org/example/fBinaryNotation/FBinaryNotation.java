package org.example.fBinaryNotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/problemset/problem/188/F
 * WARNING: Submit only in Roco language!!! It is not possible to submit code in Java.
 */
public class FBinaryNotation {
    FBinaryNotation.FastReader sc = new FastReader();
    int n = sc.nextInt();

    int binaryNotation(int n) {
        int[] binaryArr = new int[21];
        int index = 0;
        StringBuilder binaryBuilder = new StringBuilder();

        while (n > 0) {
            binaryArr[index++] = n % 2;
            n /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            binaryBuilder.append(binaryArr[i]);
        }
        return Integer.parseInt(binaryBuilder.toString());
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
