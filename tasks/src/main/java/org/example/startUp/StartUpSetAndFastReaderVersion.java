package org.example.startUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

// https://codeforces.com/problemset/problem/420/A
// Solution with Collections (Set), stream and FastReader (BufferedReader)

class StartUpSetAndFastReaderVersion {
    private final FastReader sc = new FastReader();
    private final String nameOfFirm = sc.next();

    boolean startUpSetAndFastReaderVersion(String nameOfFirm) {
        final Set<Character> symmetricalLetters = Set.of('A', 'H', 'I', 'M', 'O', 'T', 'U', 'V', 'W', 'X', 'Y');

        return IntStream.range(0, nameOfFirm.length() / 2 + 1)
                .noneMatch(i -> nameOfFirm.charAt(i) != nameOfFirm.charAt(nameOfFirm.length() - 1 - i)
                        || !symmetricalLetters.contains(nameOfFirm.charAt(i)));
    }

    private static class FastReader {
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
