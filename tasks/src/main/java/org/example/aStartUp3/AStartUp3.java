package org.example.aStartUp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/**
 * https://codeforces.com/problemset/problem/420/A
 * Solution with Collections (Set), stream and FastReader (BufferedReader)
 */
public class AStartUp3 {
    FastReader sc = new FastReader();
    String nameOfFirm = sc.next();

    public boolean aStartUp(String nameOfFirm) {
        Set<Character> symmetricalLetters = Set.of('A', 'H', 'I', 'M', 'O', 'T', 'U', 'V', 'W', 'X', 'Y');

        return IntStream.range(0, nameOfFirm.length() / 2 + 1)
                .noneMatch(i -> nameOfFirm.charAt(i) != nameOfFirm.charAt(nameOfFirm.length() - 1 - i) || !symmetricalLetters.contains(nameOfFirm.charAt(i)));
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
    }
}
