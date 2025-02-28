package org.example.petyaAndOrigami;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/1080/A

class PetyaAndOrigami {
    private final Scanner sc = new Scanner(System.in);
    private final int numberOfFriends = sc.nextInt();
    private final int numberOfSheets = sc.nextInt();

    int petyaAndOrigami(int numberOfFriends, int numberOfSheets) {
        final int red = (int) Math.ceil(2 * (double) numberOfFriends / (double) numberOfSheets);
        final int green = (int) Math.ceil(5 * (double) numberOfFriends / (double) numberOfSheets);
        final int blue = (int) Math.ceil(8 * (double) numberOfFriends / (double) numberOfSheets);
        sc.close();
        return red + green + blue;
    }
}
