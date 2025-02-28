package org.example.serejaAndDima;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class SerejaAndDimaVerifiedTest {
    private final SerejaAndDimaVerified serejaAndDima = new SerejaAndDimaVerified();
    private final List<Integer> listOfCardsInsert = List.of(1, 2, 3, 4, 5, 6, 7);

    @Test
    void shouldReturnTrueWhenNumberOfCardsIsInsideValidRange() {
        int numberOfCardsMin = 1;
        int numberOfCardsMax = 1000;

        boolean isValidForMinNumberOfCards = SerejaAndDimaVerifier.numberOfCardsVerifier(numberOfCardsMin);
        boolean isValidForMaxNumberOfCards = SerejaAndDimaVerifier.numberOfCardsVerifier(numberOfCardsMax);

        Assertions.assertTrue(isValidForMinNumberOfCards);
        Assertions.assertTrue(isValidForMaxNumberOfCards);
    }

    @Test
    void shouldReturnTrueWhenListOfCardsHasValidSize() {
        List<Integer> listOfCards = List.of(4);
        List<Integer> emptyList = Collections.emptyList();
        List<Integer> listOf1000Cards = IntStream.range(0, 1000)
                .boxed()
                .toList();

        boolean isValidForListOfOneCard = SerejaAndDimaVerifier.listOfCardsSizeVerifier(listOfCards);
        boolean isValidForListOf1000Cards = SerejaAndDimaVerifier.listOfCardsSizeVerifier(listOf1000Cards);
        boolean isValidForEmptyListOfCards = SerejaAndDimaVerifier.listOfCardsSizeVerifier(emptyList);

        Assertions.assertTrue(isValidForListOfOneCard);
        Assertions.assertTrue(isValidForListOf1000Cards);
        Assertions.assertFalse(isValidForEmptyListOfCards);
    }

    @Test
    void shouldReturnFalseWhenListOfCardsHasInvalidSize() {
        List<Integer> emptyList = Collections.emptyList();
        List<Integer> listOf1001Cards = IntStream.range(0, 1001)
                .boxed()
                .toList();

        boolean isValidForEmptyListOfCards = SerejaAndDimaVerifier.listOfCardsSizeVerifier(emptyList);
        boolean isValidForListOf1001Cards = SerejaAndDimaVerifier.listOfCardsSizeVerifier(listOf1001Cards);

        Assertions.assertFalse(isValidForEmptyListOfCards);
        Assertions.assertFalse(isValidForListOf1001Cards);
    }

    @Test
    void shouldReturnFalseWhenNumberOfCardsAndListOfCardsHaveDifferentSize() {
        int numberOfCards = 3;

        boolean isValidInputSize = SerejaAndDimaVerifier.inputSizeOfCardsVerifier(numberOfCards, listOfCardsInsert);

        Assertions.assertFalse(isValidInputSize);
    }

    @Test
    void shouldReturnTrueWhenAllCardNumbersAreDistinct() {
        boolean areCardNumbersDistinct = SerejaAndDimaVerifier.distinctNumbersOfCardsInListVerifier(listOfCardsInsert);

        Assertions.assertTrue(areCardNumbersDistinct);
    }

    @Test
    void shouldReturnOutputList() {
        int numberOfCards = 7;

        List<Integer> checkList = serejaAndDima.countingNumbersOfCards(numberOfCards, listOfCardsInsert);

        Assertions.assertEquals(checkList, List.of(16, 12));
    }
}
