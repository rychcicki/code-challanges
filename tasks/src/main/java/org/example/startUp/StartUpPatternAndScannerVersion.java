package org.example.startUp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://codeforces.com/problemset/problem/420/A
// Solution with StringBuilder, regex (Pattern, Matcher) and Scanner

class StartUpPatternAndScannerVersion {
    private final Scanner sc = new Scanner(System.in);
    private final String nameOfFirm = sc.nextLine();

    boolean startUpPatternAndScannerVersion(String nameOfFirm) {
        final Pattern patternOfSymmetricalLetters = Pattern.compile("[AHIMOTUVWXY]*");
        final Matcher myMatcher = patternOfSymmetricalLetters.matcher(nameOfFirm);
        final boolean isFitted = myMatcher.matches();

        final StringBuilder myCheck = new StringBuilder(nameOfFirm).reverse();
        final String reversedName = String.valueOf(myCheck);

        return isFitted && nameOfFirm.equals(reversedName);
    }
}
