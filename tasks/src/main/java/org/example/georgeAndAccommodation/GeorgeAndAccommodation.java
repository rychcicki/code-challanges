package org.example.georgeAndAccommodation;

import java.util.Scanner;

/**
 * A. George and Accommodation
 * https://codeforces.com/problemset/problem/467/A
 */
public class GeorgeAndAccommodation {
    public int georgeAndAccommodation() {
        Scanner sc = new Scanner(System.in);

        int numberOfRooms = sc.nextInt();
        int numberOfPeople;
        int capacity;
        int counter = 0;

        while (numberOfRooms-- >= 1) {
            numberOfPeople = sc.nextInt();
            capacity = sc.nextInt();
            if (capacity - numberOfPeople >= 2) {
                counter++;
            }
        }
        sc.close();
        return counter;
    }
}
