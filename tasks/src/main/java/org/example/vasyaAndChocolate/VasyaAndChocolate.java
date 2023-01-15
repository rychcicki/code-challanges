package org.example.vasyaAndChocolate;

import java.util.Scanner;

public class VasyaAndChocolate {

    /**
     * https://codeforces.com/problemset/problem/1065/A
     */
    public long vasyaChocolate() {
        Scanner sc = new Scanner(System.in);

        int numberOfInputs = sc.nextInt();
        long cashInRoubles;
        long barsToBuy;
        long barsForFree;
        long costOfOneBar;
        long output = 0;

        while (numberOfInputs-- >= 1) {
            cashInRoubles = sc.nextInt();
            barsToBuy = sc.nextInt();
            barsForFree = sc.nextInt();
            costOfOneBar = sc.nextInt();
            long allCost = (long) (cashInRoubles / (barsToBuy * costOfOneBar));
            if (barsToBuy * costOfOneBar > cashInRoubles) {
                output = cashInRoubles / costOfOneBar;
            } else {
                output = (allCost * barsToBuy) + (allCost * barsForFree) + (long) ((cashInRoubles % (barsToBuy * costOfOneBar)) / costOfOneBar);
            }
        }
        sc.close();
        return output;
    }
}
