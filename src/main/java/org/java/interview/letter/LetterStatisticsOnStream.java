package org.java.interview.letter;

import java.util.*;

public class LetterStatisticsOnStream implements LetterStatistics {

    /**
     * returns the first topSize number entries (letter -> count) of the most frequent letters in the string list
     * the key is the capitalized letter, the value is the number of its occurrences in all strings,
     * non-letter characters are ignored.
     *
     * for example:
     * Given list: 111111, Pen 1, Pineapple, Apple, Pen 2, 222222
     * topSize: 3
     * Returned LinkedHashMap:
     * P -> 7
     * E -> 5
     * N -> 3
     *
     * @param topSize
     * @return
     */
    public LinkedHashMap<Character, Integer> topFrequentLetters(List<String> strings, int topSize) {
        // TODO: implements this
        return new LinkedHashMap<>();
    }
}
