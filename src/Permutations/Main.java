package Permutations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> permutations = new ArrayList<>();

        StringsPermutationsGenerator stringsPermutationsGenerator = new StringsPermutationsGenerator(5);

        stringsPermutationsGenerator.setStart('y');

        // stringsPermutationsGenerator.showProgressMessage(true);

        stringsPermutationsGenerator.fillWithPermutations(permutations);

        System.out.println(permutations.size());
    }
}
