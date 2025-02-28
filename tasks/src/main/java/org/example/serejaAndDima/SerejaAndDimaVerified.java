package org.example.serejaAndDima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://codeforces.com/contest/381/problem/A

class SerejaAndDimaVerified {
    private int sumOfCardsOfSereja = 0;
    private int sumOfCardsOfDima = 0;

    void serejaAndDimaFastReader() {
        final SerejaAndDimaVerified.FastReader sc = new FastReader();
        final int numberOfCards = sc.nextInt();
        final List<Integer> listOfCards = new ArrayList<>();
        int numbersForLoop = numberOfCards;
        while (numbersForLoop-- > 0) {
            listOfCards.add(sc.nextInt());
        }
        countingNumbersOfCards(numberOfCards, listOfCards);
    }

    List<Integer> countingNumbersOfCards(int numberOfCards, List<Integer> listOfCards) {
        int greaterNumber;
        Deque<Integer> listOfCardsQueue = new ArrayDeque<>(listOfCards);

        for (int counterOfTurns = 1; counterOfTurns <= numberOfCards; counterOfTurns++) {
            if (listOfCardsQueue.getFirst() > listOfCardsQueue.getLast()) {
                greaterNumber = listOfCardsQueue.pollFirst();
                whoseCardIsIt(counterOfTurns, greaterNumber);
            } else {
                greaterNumber = listOfCardsQueue.pollLast();
                whoseCardIsIt(counterOfTurns, greaterNumber);
            }
        }
        return List.of(sumOfCardsOfSereja, sumOfCardsOfDima);
    }

    private int whoseCardIsIt(int i, Integer number) {
        if (i % 2 == 1) {
            sumOfCardsOfSereja += number;
            return sumOfCardsOfSereja;
        } else {
            sumOfCardsOfDima += number;
            return sumOfCardsOfDima;
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
