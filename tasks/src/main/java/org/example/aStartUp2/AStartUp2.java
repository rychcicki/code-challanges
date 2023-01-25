package org.example.aStartUp2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/420/A
 * Solution with Collections (Set), loops and Scanner
 * Question:
 * What is faster to read? A Set (HashSet) with complexity probably O(1) or a List (ArrayList) with complexity probably O(n)?
 */
public class AStartUp2 {
    Scanner sc = new Scanner(System.in);
    String nameOfFirm = sc.nextLine();
    //sc.close();

    public boolean aStartUp2(String nameOfFirm) {
        Set<Character> symmetricalLetters = new HashSet<>();
        symmetricalLetters.add('A');
        symmetricalLetters.add('H');
        symmetricalLetters.add('I');
        symmetricalLetters.add('M');
        symmetricalLetters.add('O');
        symmetricalLetters.add('T');
        symmetricalLetters.add('U');
        symmetricalLetters.add('V');
        symmetricalLetters.add('W');
        symmetricalLetters.add('X');
        symmetricalLetters.add('Y');

        boolean flag = true;
        for (int i = 0; i < nameOfFirm.length() / 2 + 1; i++) {
            if (nameOfFirm.charAt(i) != nameOfFirm.charAt(nameOfFirm.length() - 1 - i) || !symmetricalLetters.contains(nameOfFirm.charAt(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
