package org.example.aStartUp1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://codeforces.com/problemset/problem/420/A
 * Solution with StringBuilder, regex (Pattern, Matcher) and Scanner
 */
public class AStartUp1 {
    Scanner sc = new Scanner(System.in);
    String nameOfFirm = sc.nextLine();

    public boolean aStartUp1(String nameOfFirm) {
        Pattern patternOfSymmetricalLetters = Pattern.compile("[AHIMOTUVWXY]*");
        Matcher myMatcher = patternOfSymmetricalLetters.matcher(nameOfFirm);
        boolean isFitted = myMatcher.matches();

        StringBuilder myCheck = new StringBuilder(nameOfFirm).reverse();
        String reversedName = String.valueOf(myCheck);

        return isFitted && nameOfFirm.equals(reversedName);
    }
}
