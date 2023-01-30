package org.example.aHolidayOfEquality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/problemset/problem/758/A
 */
public class AHolidayOfEquality {
    int aHolidayOfEquality() {
        FastReader sc = new FastReader();
        List<Integer> welfareOfCitizens = new ArrayList<>();

        int numberOfCitizens = sc.nextInt();
        while (numberOfCitizens-- > 0) {
            welfareOfCitizens.add(sc.nextInt());
        }
        int max = Collections.max(welfareOfCitizens);
        welfareOfCitizens.replaceAll(i -> max - i);
        int sum = welfareOfCitizens.stream().mapToInt(i -> i).sum();
        return sum;
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
