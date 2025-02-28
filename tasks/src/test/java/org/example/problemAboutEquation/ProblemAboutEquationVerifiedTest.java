package org.example.problemAboutEquation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ProblemAboutEquationVerifiedTest {
    private final ProblemAboutEquationVerified problemAboutEquation = new ProblemAboutEquationVerified();

    @Test
    void shouldReturnFalseWhenNumberOfFriendsIsOutsideValidRange() {
        int numberOfFriendsTooFew = 1;
        int numberOfFriendsTooMany = 101;

        boolean isValidForTooFewFriends = problemAboutEquation.numberOfFriendsVerifier(numberOfFriendsTooFew);
        boolean isValidForTooManyFriends = problemAboutEquation.numberOfFriendsVerifier(numberOfFriendsTooMany);

        Assertions.assertFalse(isValidForTooFewFriends);
        Assertions.assertFalse(isValidForTooManyFriends);
    }

    @Test
    void shouldReturnFalseWhenNumberOfMillilitersOfTheDrinkInTheBottleIsOutsideValidRange() {
        int millilitersOfTheDrinkTooFew = 0;
        int millilitersOfTheDrinkTooMany = 101;

        boolean isValidForTooFewMillilitersOfTheDrink =
                problemAboutEquation.millilitersOfTheDrinkInTheBottleVerifier(millilitersOfTheDrinkTooMany);
        boolean isValidForTooManyMillilitersOfTheDrink =
                problemAboutEquation.millilitersOfTheDrinkInTheBottleVerifier(millilitersOfTheDrinkTooFew);

        Assertions.assertFalse(isValidForTooFewMillilitersOfTheDrink);
        Assertions.assertFalse(isValidForTooManyMillilitersOfTheDrink);
    }

    @Test
    void shouldReturnListOfTheVolumesOfTheDrinkToAdd() {
        int numberOfFriends = 5;
        int millilitersOfTheDrinkInTheBottle = 50;
        List<Integer> volumeOfTheDrinkInTheMugs = List.of(1, 2, 3, 4, 5);
        List<Float> expectedList = List.of(12.0f, 11.0f, 10.0f, 9.0f, 8.0f);

        List<Float> volumesToAdd = problemAboutEquation.problemAboutEquation(
                numberOfFriends, millilitersOfTheDrinkInTheBottle, volumeOfTheDrinkInTheMugs);

        Assertions.assertEquals(expectedList, volumesToAdd);
    }

    @Test
    void shouldReturnMinusOneWhenMugsCannotBeFilledEqually() {
        int numberOfFriends = 2;
        int millilitersOfTheDrinkInTheBottle = 2;
        List<Integer> volumeOfTheDrinkInTheMugs = List.of(1, 100);

        List<Float> volumesToAdd = problemAboutEquation.problemAboutEquation(
                numberOfFriends, millilitersOfTheDrinkInTheBottle, volumeOfTheDrinkInTheMugs);

        Assertions.assertEquals(List.of(-1.0f), volumesToAdd);
    }
}
