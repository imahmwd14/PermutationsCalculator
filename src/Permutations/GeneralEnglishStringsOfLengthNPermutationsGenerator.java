package Permutations;

import java.util.ArrayList;

public class GeneralEnglishStringsOfLengthNPermutationsGenerator {
    static ArrayList<String> permutations = new ArrayList<>();

    static int lengthOfStrings = 6;

    public static void main(String[] args) {
        permute(lengthOfStrings, new char[lengthOfStrings]);

        System.out.printf(
                "There are %d permutations of strings of length %d %n",
                permutations.size(),
                lengthOfStrings
        );

        System.out.println();
    }

    private static void permute(int depth, char[] chars) {
        if (depth == 0) permutations.add(String.valueOf(chars));

        if (depth > 0)
            for (char c = 'a'; c <= 'z'; c++) {
                chars[depth - 1] = c;
                permute(depth - 1, chars);
            }
    }
}
