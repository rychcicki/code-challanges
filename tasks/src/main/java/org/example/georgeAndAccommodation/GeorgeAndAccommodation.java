package org.example.georgeAndAccommodation;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/467/A

class GeorgeAndAccommodation {
    int georgeAndAccommodation() {
        final Scanner sc = new Scanner(System.in);

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
