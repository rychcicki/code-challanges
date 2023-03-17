package org.example.aProblemAboutEquation;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log
class AProblemAboutEquation3Test {
    private final AProblemAboutEquation3 aProblemAboutEquation3 = new AProblemAboutEquation3();

    @BeforeAll
    static void showMessage() {
        log.info("This is my first test's class.");
    }

    @Test
    void shouldReturnFalseWhenNumberOfFriendsLessThanTwoOrGreaterThan100() {
        //given - arrange
        int numberOfFriends = 1;

        //when - act
        boolean numberOfFriendsVerifier = aProblemAboutEquation3.numberOfFriendsVerifier(numberOfFriends);

        //then - assert
        Assertions.assertFalse(numberOfFriendsVerifier);
    }

    @Test
    void shouldReturnFalseWhenNumberOfMillilitersOfTheDrinkInTheBottleLessThanOneOrGreaterThan100() {
        //given - arrange
        int millilitersOfTheDrinkInTheBottle = 101;

        //when - act
        boolean millilitersOfTheDrinkInTheBottleVerifier = aProblemAboutEquation3.millilitersOfTheDrinkInTheBottleVerifier(millilitersOfTheDrinkInTheBottle);

        //then - assert
        Assertions.assertEquals(false, millilitersOfTheDrinkInTheBottleVerifier);
    }

    @Test
    void shouldReturnTrueWhenOutputListOfFloats() {
        //given - arrange
        int numberOfFriends = 5;
        int millilitersOfTheDrinkInTheBottle = 50;
        List<Integer> volumeOfTheDrinkInTheMugs = List.of(1, 2, 3, 4, 5);
        List<Float> outputList = List.of(12.0f, 11.0f, 10.0f, 9.0f, 8.0f);

        //when - act
        List<Float> floatsToCheck = aProblemAboutEquation3.aProblemAboutEquation(numberOfFriends, millilitersOfTheDrinkInTheBottle, volumeOfTheDrinkInTheMugs);

        //then - asset
        Assertions.assertEquals(floatsToCheck, outputList);
    }

    @Test
    void shouldReturnMinus1WhenImpossibleToFillEqualMugs() {
        //given
        int numberOfFriends = 2;
        int millilitersOfTheDrinkInTheBottle = 2;
        List<Integer> volumeOfTheDrinkInTheMugs = List.of(1, 100);

        //when
        List<Float> floatsToCheck = aProblemAboutEquation3.aProblemAboutEquation(numberOfFriends, millilitersOfTheDrinkInTheBottle, volumeOfTheDrinkInTheMugs);

        //then
        Assertions.assertEquals(floatsToCheck, List.of(-1.0f));
    }
}
