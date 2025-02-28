package org.example.serejaAndDima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://codeforces.com/contest/381/problem/A

class SerejaAndDima {
    private final FastReader sc = new FastReader();
    private final short numberOfFreeCards = sc.nextShort();
    private final short[] cards = new short[numberOfFreeCards];

    private short greaterNumber;
    private int cardsOfSereja, cardsOfDima;

    void loop() {
        for (short i = 0; i < numberOfFreeCards; i++) {
            cards[i] = sc.nextShort();
        }
    }

    String serejaAndDima(short numberOfFreeCards, short[] cards) {
        final short numberOfTurn = numberOfFreeCards;
        short whoseTurnNow = 1;

        if (numberOfFreeCards == 1) {
            cardsOfSereja += cards[0];
        } else {
            while (whoseTurnNow < numberOfTurn) {
                for (short j = 0; j < numberOfFreeCards; whoseTurnNow++) {
                    if (cards[j] > cards[numberOfFreeCards - 1]) {
                        greaterNumber = cards[j];
                        whoseIsThisCard(whoseTurnNow, greaterNumber);
                        j++;
                    } else {
                        greaterNumber = cards[numberOfFreeCards - 1];
                        whoseIsThisCard(whoseTurnNow, greaterNumber);
                        numberOfFreeCards--;
                    }
                }
            }
        }
        return cardsOfSereja + " " + cardsOfDima;
    }

    void whoseIsThisCard(short whoseTurnNow, short greaterNumber) {
        if (whoseTurnNow % 2 == 1) {
            cardsOfSereja += greaterNumber;
        } else {
            cardsOfDima += greaterNumber;
        }
    }

    private static class FastReader {
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

        short nextShort() {
            return Short.parseShort(next());
        }
    }
}
