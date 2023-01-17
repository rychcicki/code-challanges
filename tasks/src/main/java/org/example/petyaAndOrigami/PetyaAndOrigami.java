package org.example.petyaAndOrigami;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1080/A
 */
public class PetyaAndOrigami {
    Scanner sc = new Scanner(System.in);
    int numberOfFriends = sc.nextInt();
    int numberOfSheets = sc.nextInt();

    public int petyaAndOrigami(int numberOfFriends, int numberOfSheets) {
        int red = (int) Math.ceil(2 * (double) numberOfFriends / (double) numberOfSheets);
        int green = (int) Math.ceil(5 * (double) numberOfFriends / (double) numberOfSheets);
        int blue = (int) Math.ceil(8 * (double) numberOfFriends / (double) numberOfSheets);
        // Do I have to close Scanner?? I can't put it outside the method.
        sc.close();

        return red + green + blue;
    }
}
