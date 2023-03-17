package org.example.aSerejaAndDima;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

class ASerejaAndDima2Test {
    private final ASerejaAndDima2.ASerejaAndDima2Verifier aSerejaAndDima2Verifier = new ASerejaAndDima2.ASerejaAndDima2Verifier();
    private final ASerejaAndDima2 aSerejaAndDima2 = new ASerejaAndDima2();
    private static List<Integer> listOfCardsInsert;

    @BeforeAll
    static void insertListOfCards() {
        listOfCardsInsert = List.of(1, 2, 3, 4, 5, 6, 7);
    }

    @Test
    void shouldReturnTrueWhenNumberOfCardsFrom1To1000() {
        //given - arrange
        int numberOfCards = 1;

        //when - act
        boolean checkNumberOfCards = aSerejaAndDima2Verifier.numberOfCardsVerifier(numberOfCards);

        //then - assert
        Assertions.assertTrue(checkNumberOfCards);
    }

    @Test
    void shouldReturnTrueWhenListOfCardsFrom1To1000AndNotNull() {
        //given - arrange
        List<Integer> listOfCards = List.of(4, 1, 2, 10);

        //when - act
        boolean checkListOfCards = aSerejaAndDima2Verifier.validNumbersInListOfCardsVerifier(listOfCards);

        //then - assert
        Assertions.assertTrue(checkListOfCards);
    }

    @Test
    void shouldReturnFalseWhenNumberOfCardsAndListOfCardsHaveDifferentSize() {
        //given - arrange
        int numberOfCards = 3;
        List<Integer> listOfCards = List.of(4, 1, 2, 10);

        //when - act
        boolean check = aSerejaAndDima2Verifier.inputSizeOfCardsVerifier(numberOfCards, listOfCards);

        //then - assert
        Assertions.assertFalse(check);

    }

    @Test
    void shouldReturnTrueWhenNumbersInListOfCardsAreDistinct() {
        //given
        //List<Integer> listOfCards = List.of(1, 2, 3, 4, 5, 6, 7);
        //Czy może nie być 'given', jeżeli generujemy dane poprzez odrębną metodę statyczną z @BeforeAll??

        //when
        boolean checkDistinctNumbersInListOfCards = aSerejaAndDima2Verifier.distinctNumbersOfCardsInListVerifier(listOfCardsInsert);

        //then
        Assertions.assertEquals(true, checkDistinctNumbersInListOfCards);
    }

    @Test
    void shouldReturnFalseWhenOutputListSizeIsNot2() {
        //given - arrange
        List<Integer> outputSumOfCards = List.of(16, 12);

        //when - act
        int checkOutputListSize = aSerejaAndDima2Verifier.outputListSizeVerifier(outputSumOfCards);

        //then - assert
        Assertions.assertEquals(2, checkOutputListSize);
    }

    @Test
    void shouldReturnOutputList() {
        //given
        int numberOfCards = 7;
//        List<Integer> listOfCards = List.of(1, 2, 3, 4, 5, 6, 7);

        //when - act
        List<Integer> checkList = aSerejaAndDima2.countingNumbersOfCards(numberOfCards, listOfCardsInsert);

        //then - assert
        Assertions.assertEquals(checkList, List.of(16, 12));
    }
}
