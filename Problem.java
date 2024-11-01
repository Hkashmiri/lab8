package edu.desu.b_homework;

public class Problem {

    /**
     * Counts the number of non-unique characters in the given string.
     *
     * @param data The input string to analyze.
     * @return The number of characters that appear more than once in the string.
     */
    public int countDuplicates(String data) {
        if (data == null || data.isEmpty()) {
            return 0;  // if the string is empty or null
        }

        int[] frequency = new int[256];
        int duplicateCount = 0;

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            frequency[c]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}
