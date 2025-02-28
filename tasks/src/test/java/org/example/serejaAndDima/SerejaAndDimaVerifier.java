package org.example.serejaAndDima;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SerejaAndDimaVerifier {
    private SerejaAndDimaVerifier() {
    }

    static boolean numberOfCardsVerifier(int numberOfCards) {
        return numberOfCards >= 1 && numberOfCards <= 1000;
    }

    static boolean listOfCardsSizeVerifier(List<Integer> listOfCards) {
        return !listOfCards.isEmpty() && listOfCards.size() <= 1000;
    }

    static boolean inputSizeOfCardsVerifier(int numberOfCards, List<Integer> listOfCards) {
        return numberOfCards == listOfCards.size();
    }

    static boolean distinctNumbersOfCardsInListVerifier(List<Integer> listOfCards) {
        Set<Integer> setOfCards = new HashSet<>(listOfCards);
        return setOfCards.size() == listOfCards.size();
    }
}
