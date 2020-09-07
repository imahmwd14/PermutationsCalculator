package Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SixLetterStringsContaining_A_and_B {

    // here we add every permutation that has an a and a b
    static ArrayList<ArrayList<Character>> permutations = new ArrayList<>();

    // this list is made static to prevent the creation of the same list over and over
    // every time we check a permutation whether it has an a and a b.
    static List<Character> aAndB = Arrays.asList('a', 'b');

    // here is specified the length of the strings that we want to permute
    static int lengthOfStrings = 6;

    public static void main(String[] args) {
        // here the process of calculating the six letter strings containing an a and a b is started
        permute(lengthOfStrings, new ArrayList<>());
        // here, after the program finishes the calculation, it prints the number of strings containing an a and a b
        System.out.println(permutations.size());
    }

    private static void permute(int depth, ArrayList<Character> nthPermutation) {
        // if the depth is equal to 0, then we'd have reached a leaf of the recursion tree, which means that
        // a full permutation has been calculated
        if (depth == 0 && nthPermutation.containsAll(aAndB))
            permutations.add(nthPermutation);

        // as long as the depth is greater than 0, then there are still many more permutations to calculate
        if (depth > 0)
            for (char i = 'a'; i <= 'z'; i++) {
                // a copy must be created to avoid using the same array when calculating new permutations
                ArrayList<Character> nthPermutationCopy = new ArrayList<>(nthPermutation);
                nthPermutationCopy.add(i);
                // here the method is called to continue recursively calculating the rest of the permutations
                permute(depth - 1, nthPermutationCopy);
            }
    }
}
