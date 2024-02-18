package org.example.dUnnaturalLanguageProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://codeforces.com/problemset/problem/1915/D
 */
public class UnnaturalLanguageProcessing {
    FastReader sc = new FastReader();
    int numberOfTests = sc.nextInt();

    void loop() {
        while (numberOfTests-- > 0) {
            int wordLength = sc.nextInt();  //unnecessary, but required by input
            String sentence = sc.next();
            unnaturalLanguageProcessing(sentence);
        }
    }

    public static String unnaturalLanguageProcessing(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();

        Stream<String> streamSentence = Stream.of(sentence);
        List<String> changedSentence = streamSentence
                .map(letter -> letter.replace("a", "V")
                        .replace("e", "V")
                        .replace("b", "C")
                        .replace("c", "C")
                        .replace("d", "C")
                ).collect(Collectors.toList());

        changedSentence.replaceAll(c -> c.replace("CVCC", "CVC.C"));
        changedSentence.replaceAll(c -> c.replace("CVCVC", "CV.CVC"));
        changedSentence.replaceAll(c -> c.replace("CVCCV", "CVC.CV"));
        changedSentence.replaceAll(c -> c.replace("CVCV", "CV.CV"));
        changedSentence.replaceAll(c -> c.replace("CVCV", "CV.CV"));

        String pattern = changedSentence.toString().replace("[", "").replace("]", "");

        int j = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) != '.') {
                stringBuilder.append(sentence.charAt(j));
                j++;
            } else {
                stringBuilder.append(".");
            }
        }
        return stringBuilder.toString();
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
