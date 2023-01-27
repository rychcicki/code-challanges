package org.example.aStartUp2;

import java.util.Scanner;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/420/A
 * Solution with Collections (Set), loops and Scanner
 */
public class AStartUp2 {
    Scanner sc = new Scanner(System.in);
    String nameOfFirm = sc.nextLine();

    public boolean aStartUp2(String nameOfFirm) {
        Set<Character> symmetricalLetters = Set.of('A', 'H', 'I', 'M', 'O', 'T', 'U', 'V', 'W', 'X', 'Y');

        boolean flag = true;
        int lengthOfName = nameOfFirm.length();

        for (int i = 0; i < lengthOfName / 2 + 1; i++) {
            char frontLetterAtNameOfFirm = nameOfFirm.charAt(i);
            char backLetterAtNameOfFirm = nameOfFirm.charAt(lengthOfName - 1 - i);
            if (frontLetterAtNameOfFirm != backLetterAtNameOfFirm || !symmetricalLetters.contains(frontLetterAtNameOfFirm)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
