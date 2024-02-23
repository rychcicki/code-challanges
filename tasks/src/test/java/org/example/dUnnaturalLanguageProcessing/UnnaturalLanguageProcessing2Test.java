package org.example.dUnnaturalLanguageProcessing;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class UnnaturalLanguageProcessing2Test {
    private final UnnaturalLanguageProcessing2 unnaturalLanguageProcessing2 = new UnnaturalLanguageProcessing2();

    @Test
    void shouldReturnTrueWhenIsVowelOrFalseWhenIsConsonant() {
        char vowelA = 'a';
        char vowelE = 'e';
        char consonantB = 'b';
        boolean isVowelA = unnaturalLanguageProcessing2.isVowel(vowelA);
        boolean isVowelE = unnaturalLanguageProcessing2.isVowel(vowelE);
        boolean isNotVowel = unnaturalLanguageProcessing2.isVowel(consonantB);
        Assertions.assertAll(
                () -> Assertions.assertTrue(isVowelA),
                () -> Assertions.assertTrue(isVowelE),
                () -> Assertions.assertFalse(isNotVowel)
        );
    }

    @Test
    void shouldReturnSentenceWithSyllables() {
        String sentence1 = "bacedbab";
        String resultOfProcessing1 = "ba.ced.bab";
        String sentence2 = "dababbabababbabbababba";
        String resultOfProcessing2 = "da.bab.ba.ba.bab.bab.ba.bab.ba";
        String sentence3 = "dacdac";
        String resultOfProcessing3 = "dac.dac";
        String sentence4 = "cab";
        String resultOfProcessing4 = "cab";
        String sentence5 = "deddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddeddedded";
        String resultOfProcessing5 = "ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded.ded" +
                ".ded.ded.ded.ded.ded.ded.ded.ded.ded";
        String sentenceForTest1 = unnaturalLanguageProcessing2.unnaturalLanguageProcessing(sentence1);
        String sentenceForTest2 = unnaturalLanguageProcessing2.unnaturalLanguageProcessing(sentence2);
        String sentenceForTest3 = unnaturalLanguageProcessing2.unnaturalLanguageProcessing(sentence3);
        String sentenceForTest4 = unnaturalLanguageProcessing2.unnaturalLanguageProcessing(sentence4);
        String sentenceForTest5 = unnaturalLanguageProcessing2.unnaturalLanguageProcessing(sentence5);
        Assertions.assertAll(
                () -> Assertions.assertEquals(sentenceForTest1, resultOfProcessing1),
                () -> Assertions.assertEquals(sentenceForTest2, resultOfProcessing2),
                () -> Assertions.assertEquals(sentenceForTest3, resultOfProcessing3),
                () -> Assertions.assertEquals(sentenceForTest4, resultOfProcessing4),
                () -> Assertions.assertEquals(sentenceForTest5, resultOfProcessing5)
        );
    }
}
