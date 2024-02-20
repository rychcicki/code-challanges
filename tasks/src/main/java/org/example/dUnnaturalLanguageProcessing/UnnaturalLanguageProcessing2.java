package org.example.dUnnaturalLanguageProcessing;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://codeforces.com/problemset/problem/1915/D
 * Only loop version
 */
@Slf4j
public class UnnaturalLanguageProcessing2 {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e';
    }

    static String unnaturalLanguageProcessingFastScan() {
        FastReader sc = new FastReader();
        int numberOfTests = sc.nextInt();
        String sentence = "";

        while (numberOfTests-- > 0) {
            int wordLength = sc.nextInt();
            sentence = sc.next();
            if (wordLength != sentence.length()) {
                log.error("Wrong length of word.");
            }
        }
        return sentence;
    }

    static String unnaturalLanguageProcessing(String sentence) {
        StringBuilder syllables = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (i != 0 && !isVowel(sentence.charAt(i))) {
                if (i + 1 < sentence.length() && isVowel(sentence.charAt(i + 1))) {
                    syllables.append(".");
                }
            }
            syllables.append(sentence.charAt(i));
        }
        return syllables.toString();
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
