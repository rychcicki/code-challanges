package org.example.aSerejaAndDima;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ASerejaAndDima2Verifier {
    boolean numberOfCardsVerifier(int numberOfCards) {
        return numberOfCards >= 1 && numberOfCards <= 1000;
    }

    boolean validNumbersInListOfCardsVerifier(List<Integer> listOfCards) {
        return listOfCards.size() >= 1 && listOfCards.size() <= 1000 && !listOfCards.isEmpty();
    }

    boolean inputSizeOfCardsVerifier(int numberOfCards, List<Integer> listOfCards) {
        return numberOfCards == listOfCards.size();
    }

    boolean distinctNumbersOfCardsInListVerifier(List<Integer> listOfCards) {
        Set<Integer> setOfCards = new HashSet<>(listOfCards);
        return setOfCards.size() == listOfCards.size();
    }

    int outputListSizeVerifier(List<Integer> outputSumOfCards) {
        return outputSumOfCards.size();
    }
}
